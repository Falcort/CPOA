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
class MoviesModel extends Model
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
        $this->query("SELECT * FROM MOVIE");
        $Movies = $this->resultSet();
        return $Movies;
    }

    public function detailed()
    {
      $this->query("SELECT * FROM MOVIE WHERE numVisa= :id");
      $this->bind(':id', $_GET['id']);
      $Movie = $this->single();

      $this->query("SELECT VIP.numVIP, lastNameVIP, firstNameVIP FROM MOVIE, CASTING, VIP WHERE MOVIE.numVisa=:id AND CASTING.numVisa=:id AND CASTING.numVIP=VIP.numVIP");
      $this->bind(':id', $_GET['id']);
      $VIP = $this->resultSet();

      $this->query("SELECT VIP.numVIP, lastNameVIP, firstNameVIP FROM MOVIE, REALISATION, VIP WHERE REALISATION.numVisa=:id AND REALISATION.numVIP=VIP.numVIP AND MOVIE.numVISA=:id");
      $this->bind(':id', $_GET['id']);
      $real = $this->single();

      $array = array($Movie, $VIP, $real);
      return $array;
    }
}
