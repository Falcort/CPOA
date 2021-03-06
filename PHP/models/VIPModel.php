<?php
/**
 * Star Citizen model of MVC
 *
 * This file contains the class for database interaction of controller StarCitizen
 *
 * @category   models
 * @package    models
 * @author     Thibault SOUQUET
 * @version    1.0
 * @since      2.0
 */

/**
 * Class starCitizenModel
 *
 * This class is the database interaction of the Star Citizen controller
 * @version 1.0
 * @author Tibault SOUQUET
 */
class VIPModel extends Model
{
    /**
     * Main interaction
     *
     * This function is the default one call, it contains the base information of the default page
     *
     * @return mixed All the ships in database
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function index()
    {
        $this->query("SELECT count(*), VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, VIP.civilityVIP, VIP.bornDate, VIP.bornPlace, VIP.codeStatus, VIP.codeRole, VIP.nationality, PHOTO.wayPhoto FROM PHOTO, TAG, VIP WHERE VIP.numVIP = TAG.numVIP AND PHOTO.idPhoto = TAG.idPhoto GROUP BY VIP.numVIP
UNION 
SELECT count(*), VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, VIP.civilityVIP, VIP.bornDate, VIP.bornPlace, VIP.codeStatus, VIP.codeRole, VIP.nationality, IFNULL(0,PHOTO.wayPhoto) FROM VIP, PHOTO, TAG WHERE VIP.numVIP NOT IN (SELECT numVIP FROM TAG) GROUP BY VIP.numVIP");
        $VIPs = $this->resultSet();
        return $VIPs;
    }

    public function detailed()
    {

        $this->query("SELECT * FROM VIP WHERE VIP.numVIP = :id");
        $this->bind(':id', $_GET['id']);
        $VIP = $this->single();

        $this->query("SELECT * FROM CASTING, MOVIE, GENRE WHERE CASTING.numVIP = :id AND CASTING.numVisa=MOVIE.numVisa AND GENRE.genreID=MOVIE.genre");
        $this->bind(':id', $_GET['id']);
        $Movies = $this->resultSet();

        $this->query("SELECT * FROM EVENEMENT WHERE numVIP1= :id OR partnerVIP= :id");
        $this->bind(':id', $_GET['id']);
        $Weddings = $this->resultSet();

        $partnerCar = array();

        foreach ($Weddings as $wedding) {
            if ($wedding['numVIP1'] != $_GET['id'] && $wedding['numVIP1'] != null) {
                $this->query("SELECT numVIP, lastNameVIP, firstNameVIP FROM VIP WHERE numVIP = :id");
                $this->bind(':id', $wedding['numVIP1']);
                $partner = $this->single();
            }
            if ($wedding['partnerVIP'] != $_GET['id'] && $wedding['partnerVIP'] != null) {
                $this->query("SELECT numVIP, lastNameVIP, firstNameVIP FROM VIP WHERE numVIP = :id");
                $this->bind(':id', $wedding['partnerVIP']);
                $partner = $this->single();
            }
            array_push($partnerCar, $partner);
        }

        $this->query("SELECT MOVIE.numVisa, title, releaseDate FROM MOVIE, REALISATION WHERE REALISATION.numVIP = :id AND REALISATION.numVisa=MOVIE.numVisa");
        $this->bind(':id', $_GET['id']);
        $realise = $this->resultSet();

        $this->query("SELECT idPhoto, wayPhoto FROM PHOTO WHERE idPhoto IN (SELECT idPHOTO FROM TAG WHERE numVIP = :id)");
        $this->bind(':id', $_GET['id']);
        $pictures = $this->resultSet();


        $array = array($VIP, $Movies, $Weddings, $partnerCar, $realise, $pictures);

        return $array;
    }
}
