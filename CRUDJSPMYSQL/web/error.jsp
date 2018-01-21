<%-- 
    Document   : error
    Created on : 1/05/2016, 07:48:13 PM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" isErrorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link href="../css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.css.map" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/javascript"/>
        <link href="../css/bootstrap.css.map" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/libs/bootstrap/bootstrap.js" type="text/javascript"></script>
        <script src="../js/libs/bootstrap/bootstrap.min.js"></script>
        <script src="../js/libs/jquery/jquery.js"></script>
        <script src="../js/libs/jquery/jquery-1.11.1.js"></script>
    </head>
    <body>
        <h1>Error</h1>
        <h3><%=request.getAttribute("mensajeError")%> <%=exception.getMessage()%></h3></h3>
    <h3><a href="index.jsp">Volver</a></h3>
</body>
</html>
