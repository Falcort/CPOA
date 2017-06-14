<?php
require_once('db_connect.php');

if (isset($_GET['ressource']) && isset($_GET['id']) && $_GET['ressource'] != '' && $_GET['id'] != '')
{
    $ressource = $_GET['ressource'];
    $id = $_GET['id'];
    $query = "SELECT " . $ressource . " FROM utilisateur, ressources_utilisateur WHERE utilisateur.id_utilisateur = " . $id . " AND utilisateur.id_utilisateur = ressources_utilisateur.id_utilisateur";
    $result = $mysqli->query($query);
    if ($result->num_rows == 0)
    {
        return "Erreur";
    }
    $row = $result->fetch_array(MYSQLI_ASSOC);
    $var = $row[''.$ressource];
    print_r($var);
}
else
{
    print_r('Erreur');
}
?>
