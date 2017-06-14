<?php
require_once('db_connect.php');
$result_1 = $mysqli->query("SELECT nb_ressources_1 FROM utilisateur, ressouces_utilisateur WHERE utilisateur.id_utilisateur = 0 AND utilisateur.id_utilisateur = ressouces_utilisateur.id_utilisateur");
$result_2 = $mysqli->query("SELECT nb_ressources_2 FROM utilisateur, ressouces_utilisateur WHERE utilisateur.id_utilisateur = 0 AND utilisateur.id_utilisateur = ressouces_utilisateur.id_utilisateur");
if ($result_1->num_rows == 0 && $result_2->num_rows == 0)
{
  return -1; //base vide ou erreur
}
$row_1 = $result_1->fetch_array(MYSQLI_ASSOC);
$var_1 = $row_1['nb_ressources_1'];

$row_2 = $result_2->fetch_array(MYSQLI_ASSOC);
$var_2 = $row_2['nb_ressources_2'];

$var_1 = $var_1 + 100;
$var_2 = $var_2 + 100;

$mysqli->query("UPDATE `ressouces_utilisateur` SET `nb_ressources_1`='$var_1',`nb_ressources_2`='$var_2' WHERE 1");
?>
