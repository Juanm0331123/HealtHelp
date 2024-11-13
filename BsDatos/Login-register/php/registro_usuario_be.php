<?php

    include 'conexion_be.php';

    $nombre_completo = $_POST['nombre_completo'];
    $correo = $_POST['correo'];
    $usuario = $_POST['usuario'];
    $contrasena = $_POST['contrasena'];

    $query = "INSERT INTO usuarios (nombre_completo, correo, usuario, contrasena)
              VALUES ('$nombre_completo', '$correo', '$usuario', '$contrasena')";

    //Verificar que el correo no se repita en la base de datos
    $verificar_correo_usuario = mysqli_query($conexion, "SELECT * FROM usuarios WHERE correo='$correo' OR usuario='$usuario' ");

    if(mysqli_num_rows($verificar_correo_usuario) > 0){
        echo '
        <script>
            alert("El correo y/o el usuario ya existen, pruebe con otro.");
            window.location ="../index.php";
        </script>
        ';

        exit();
    }
    
    $ejecutar = mysqli_query($conexion, $query);

    if($ejecutar){
        echo '
            <script>
                alert("Usuario almacenado exitosamente");
                window.location ="../index.php";
            </script>
        ';

    }else{
        echo '
            <script>
                alert("Intentalo nuvamente, usuario no almacenado");
                window.location ="../index.php";
            </script>
        ';
    }
    
    mysqli_close($conexion);

?>