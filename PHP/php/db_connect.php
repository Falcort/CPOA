<?php
require_once('db_config.php');

///// Connection /////
$mysqli = new mysqli(HOST, USER, PASSWORD, DATABASE);

///// Checks /////
if ($mysqli->connect_error) {
    die('Erreur de connexion (' . $mysqli->connect_errno . ') ' . $mysqli->connect_error);
}
?>
