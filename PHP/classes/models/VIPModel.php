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
        $this->query("SELECT * FROM VIP");
        $VIPs = $this->resultSet();
        return $VIPs;
    }

    public function detailed()
    {

        $this->query("SELECT * FROM VIPWHERE VIP.numVIP=:id");
        $this->bind(':id', $_GET['id']);
        $VIP = $this->single();

        $this->query("SELECT * FROM CASTING, MOVIE WHERE CASTING.numVIP=:id AND CASTING.numVisa=MOVIE.numVisa");
        $this->bind(':id', $_GET['id']);
        $Movies = $this->resultSet();






        $array = array($VIP, $Movies);

        return $array;
    }
}
