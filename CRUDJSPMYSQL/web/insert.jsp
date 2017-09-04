<%-- 
    Document   : insert
    Created on : 5/08/2015, 11:50:03 PM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
    </head>
    <body>
        <h1>Registrar Producto</h1>
        <form name="frmProductos" action="./insert" method="post">
            <label for="txtNombreProducto">Nombre Producto</label>
            <input type="text" id="txtNombreProducto" name="txtNombreProducto"/>
            <label for="txtPrecioVenta">Precio Venta</label>
            <input type="text" id="txtPrecioVenta" name="txtPrecioVenta"/>
            <label for="dateFechaVencimiento">Fecha de Vencimiento</label>
            <input type="date" id="dateFechaVencimiento" name="dateFechaVencimiento"/>
            <input type="submit" value="Registrar Producto"/>
            <br/>
            <br/>
            <a href="index.jsp">Volver</a>
        </form>
    </body>
</html>
