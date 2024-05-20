<%---
    Document: index
    Created on: 2013/11/25, 10:00:00 AM
    Author: andresarevca
---%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSF 2.2</title>
    </head>
    <body>
        <h1>Ejemplos de expresiones</h1>
        <%-- Mostrar la fecha y hora actual --%>
        <%= new java.util.Date().toString() %><br/>

        <%-- Convertir a mayúsculas --%>
        <%= "hola mundo".toUpperCase() %><br/>

        <%-- Restar dos números --%>
        <%= 10 - 5 %><br/>

        <%-- Generar dos números aleatorios --%>
        <%= Math.random() %><br/>
        <%= Math.random() %><br/>
    </body>