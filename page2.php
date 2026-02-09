<?php
session_start();
?>


<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>TP PHP 1 - Page 2</title>
</head>
<body>

<h1>TP PHP - Page 2</h1>
<?php

$prenomSession = $_SESSION["prenom_session"] ?? "AUCUNE
SESSION";
echo "<p>Session lue sur la page 2 : $prenomSession</p>";

$prenomRecu = $_GET["prenom"] ?? "INCONNU";
echo "<p>Prénom reçu via l'URL : $prenomRecu </p>";

echo  "<p>Prénom sur la page 2 : " . ($prenom ?? "INCONNU") . "</p>";

$prenomCookie = $_COOKIE["prenom_cookie"] ?? "AUCUN COOKIE";
echo "<p>Cookie lu sur la page 2 : $prenomCookie</p>";
?>
<p><a href="index.php">Retour page 1</a></p>
</body>
</html>