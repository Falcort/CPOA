<?php
/**
 * Index of the website
 *
 * This file if the index of the website <br />
 * This file is gonna redirect you to the correct page of te website
 *
 * @category   index
 * @package    index
 * @author     Thibault SOUQUET
 * @version    2.0
 * @since      1.0
 */

/**
 * For the display of errors
 */
ini_set('display_errors', 1);
error_reporting(E_ALL);

session_start();

require('/var/www/html/defines/paths.php');
require (PATH_FILES . PATH_DEFINES . 'db_config.php');

require(PATH_FILES . PATH_CLASSES . 'Materialize.php');
require(PATH_FILES . PATH_CLASSES . 'Controller.php');
require(PATH_FILES . PATH_CLASSES . 'Model.php');

require(PATH_FILES . PATH_CONTROLLERS . 'Home.php');
require(PATH_FILES . PATH_CONTROLLERS . 'VIP.php');
require(PATH_FILES . PATH_CONTROLLERS . 'Movies.php');

require(PATH_FILES . PATH_MODELS . 'HomeModel.php');
require(PATH_FILES . PATH_MODELS . 'VIPModel.php');
require(PATH_FILES . PATH_MODELS . 'MoviesModel.php');

/**
 * Create a new object with the URL content
 */
$materialize = new Materialize($_GET);

/**
 * Create the controller with the bootstrap class
 */
$controller = $materialize->createController();

/**
 * Execute the main action of the page
 */
if($controller)
{
    $controller->executeAction();
}
