<?php
require_once('db_connect.php');

if (isset($_GET['pokemon']) && isset($_GET['id']) && $_GET['pokemon'] != '' && $_GET['id'] != '')
{
    $pokemon = $_GET['pokemon'];
    $id = $_GET['id'];
    $query = "SELECT " . $pokemon . " FROM utilisateur, pokemons_utilisateur WHERE utilisateur.id_utilisateur = " . $id . " AND utilisateur.id_utilisateur = pokemons_utilisateur.id_utilisateur";
    $result = $mysqli->query($query);
    if ($result->num_rows == 0)
    {
        return "Erreur";
    }
    $row = $result->fetch_array(MYSQLI_ASSOC);
    $var = $row[''.$pokemon];
    print_r($var);
}
else
{
    print_r('Erreur');
}
?>
