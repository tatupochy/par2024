<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Datos del Usuario</title>
</head>
<body>
<h1>Datos del Usuario:</h1>
<form action="SvUsuarios" method="post">
    <label for="ci">CI:</label>
    <input type="text" id="ci" name="ci" required /><br><br>

    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required /><br><br>

    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" required /><br><br>

    <label for="telefono">Telefono:</label>
    <input type="text" id="telefono" name="telefono" required /><br><br>

    <input type="submit" value="Enviar" />
</form>

<h1>Ver Usuario:</h1>
<p>Para ver los datos de los usuarios cargados haga click en el siguiente botón.</p>
<form action="SvUsuarios" method="get">
    <input type="submit" value="Ver Usuarios" />
</form>
</body>
</html>
