<%-- 
    Document   : resultado
    Created on : 6/08/2015, 11:12:51 AM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>Procesamiento</h1>
        <h3><%=request.getAttribute("mensaje")%></h3>
        <a href="index.jsp">Volver</a>
    </body>
</html>
