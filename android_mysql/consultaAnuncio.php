<?php
include('conexion.php');
if ($resultset = getSQLResultSet("SELECT * FROM `tablon`")) {

    while ($row = $resultset->fetch_array(MYSQLI_NUM)) {
        echo json_encode($row);
    }
}
