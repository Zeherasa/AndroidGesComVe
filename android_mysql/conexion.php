<?php

$mysql = new mysqli("localhost", "root", "21022001Jose", "gesconve");

if ($mysql->connect_error) {
    die("Error de conexión");
} else {
    echo ("Conexión exitosa");
}

function ejecutarSQLCommand($comando)
{
    $mysql = new mysqli("localhost", "root", "21022001Jose", "gesconve");

    if ($mysql->connect_error) {
        die("Error de conexión");
    } else {
        echo ("Conexión exitosa");
    }

    if ($mysql->multi_query($comando)) {
        if ($resultset = $mysql->store_result()) {
            while ($row = $resultset->fetch_array(MYSQLI_BOTH)) {
                echo 'listo';
            }
            $resultset->free();
        }
    }

    $mysql->close();
}

function getSQLResultSet($comando)
{
    $mysql = new mysqli("localhost", "root", "21022001Jose", "gesconve");

    if ($mysql->connect_error) {
        die("Error de conexión");
    } else {
        echo ("Conexión exitosa");
    }

    if ($mysql->multi_query($comando)) {
        return $mysql->store_result();
    }
}
