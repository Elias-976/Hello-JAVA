<?php
session_start();

$prenom = "Toto";
setcookie("prenom_cookie", $prenom, time() + 3600); // 1 heure
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>TP PHP 1 - Index</h1>
    <p>Cookie "prenom_cookie" créé (durée : 1h).</p>

    <p>Session créée : <?php echo $_SESSION["prenom_session"] ?></p>

    <?php
    
    echo "<p>PHP fonctionne !</p>";
    echo "<p>Date : " .date("d/m/Y h:i:s") . "</p>";

    $prenom = "Toto";
    echo "<p>Prénom créé sur la page 1 : $prenom</p>";

    ?>
    <p>
       <a href="page2.php?prenom=<?php echo $prenom; ?>">Aller sur la
page 2</a>
    </p>
</body>
</html>