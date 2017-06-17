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
class PicturesModel extends Model
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
        $this->query("SELECT COUNT(*), TAG.idPhoto, VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, PHOTO.placePhoto, PHOTO.yearPhoto, PHOTO.wayPhoto FROM PHOTO, VIP, TAG WHERE VIP.numVIP = TAG.numVIP AND TAG.idPhoto = PHOTO.idPhoto GROUP BY TAG.idPhoto HAVING COUNT(*) = 1 UNION SELECT COUNT(*), TAG.idPhoto, VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, PHOTO.placePhoto, PHOTO.yearPhoto, PHOTO.wayPhoto FROM PHOTO, VIP, TAG WHERE VIP.numVIP = TAG.numVIP AND TAG.idPhoto = PHOTO.idPhoto GROUP BY TAG.idPhoto HAVING COUNT(*) > 1
");
        $Pictures = $this->resultSet();
        return $Pictures;
    }

    public function detailed()
    {
        $this->query("SELECT * FROM PHOTO, VIP, TAG WHERE VIP.numVIP = TAG.numVIP AND TAG.idPhoto = PHOTO.idPhoto AND PHOTO.idPhoto = :id");
        $this->bind(":id", $_GET['id']);
        $Pictures = $this->single();

        $this->query("SELECT * FROM VIP, TAG WHERE idPhoto = :id AND TAG.numVIP = VIP.numVIP");
        $this->bind(":id", $_GET['id']);
        $VIP = $this->resultSet();
        return array($Pictures, $VIP);
    }
}
