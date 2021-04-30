<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 29/04/2021
  Time: 9:06 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NÓMINA</title>
</head>
<body>
<h1>Calcule la Nómina</h1>

<form action="/NominaServlet" method="post">
    <label for="nombre"> Nombre:</label>
    <input type="text" id="nombre" name="nombre">

    <br>
    <label for="apellidos">Apellidos:</label>
    <input type="text" id="apellidos" name="apellidos">

    <br>
    <label for="documento">Documento:</label>
    <input type="text" id="documento" name="documento">

    <br>
    <label for="dlaborados">Dias laborados:</label>
    <input type="text" id="dlaborados" name="dlaborados">

    <br>
    <label for="sueldo">Sueldo mensual:</label>
    <input type="text" id="sueldo" name="sueldo">

    <br>

    <input type="submit" value="Calcular">

</form>
</body>
</html>