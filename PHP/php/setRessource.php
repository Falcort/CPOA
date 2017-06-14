<?php
require_once('db_connect.php');

if (isset($_GET['ressource']) && isset($_GET['id']) && $_GET['ressource'] != '' && $_GET['id'] != '')
{
    $ressource = $_GET['ressource'];
    $id = $_GET['id'];
    $query = "SELECT " . $ressource . " FROM utilisateur, ressources_utilisateur WHERE utilisateur.id_utilisateur = " . $id . " AND utilisateur.id_utilisateur = ressources_utilisateur.id_utilisateur";
    $result = $mysqli->query($query);
	$row = $result->fetch_array(MYSQLI_ASSOC);
    $var = $row[''.$ressource];

    if ($result->num_rows == 0)
    {
        return "Erreur";
    }
	if(isset($_GET['nb']))
	{
		$nb = $_GET['nb'];
		$nb = $var + $nb;
	}
	else
	{
		return "Erreur";
	}

	$query2 = "UPDATE ressources_utilisateur set " . $ressource . "=" . $nb . " WHERE id_utilisateur=" .$id;
	$mysqli->query($query2);
}
else
{
    print_r('Erreur');
}
?>
