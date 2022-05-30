<?php

if($_SERVER["REQUEST_METHOD"] == "POST"){
    require_once 'conexion.php';
    $anuncio = $_POST["anuncio"];
    $title = $_POST["title"];
    $query = "INSERT INTO tablon (anuncio, title) VALUES('".$anuncio."', '".$title."')";
    $resultado = $mysql->query($query);

    if($resultado == true){
        echo "Datos insertado";
    }else{
        echo "Error al insertar los datos";
    }

    $mysql->close();
}