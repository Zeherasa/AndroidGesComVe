<?php

if($_SERVER["REQUEST_METHOD"] == "POST"){
    require_once 'conexion.php';
    $tipe = $_POST["tipe"];
    $description = $_POST["description"];
    $idUser = 1;
    $query = "INSERT INTO ticket (idUser, tipe, description, status, dateIni) VALUES('".$idUser."', '".$tipe."', '".$description."', 'abierta', CURDATE())";
    $resultado = $mysql->query($query);

    if($resultado == true){
        echo "Datos insertado";
    }else{
        echo "Error al insertar los datos";
    }
}