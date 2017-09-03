<%-- 
    Document   : update
    Created on : 5/08/2015, 11:50:40 PM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Producto</title>
    </head>
    <body>
        <h1>Datos a Editar</h1>
        <jsp:useBean id="ejbProducto" scope="request" class="com.crud.ejb.EJBProducto" />
        <form action="./update" method="post">
            <label for="txtIdProducto">Id Producto</label>
            <input type="text" id="txtIdProducto" name="txtIdProducto" value="${ejbProducto.getProducto().idProducto}" readonly="readonly"/> 
            <label for="txtNombreProducto">Nombre Producto</label>
            <input type="text" id="txtNombreProducto" name="txtNombreProducto" value="${ejbProducto.getProducto().nombreProducto}"/>
            <label for="txtPrecioVenta">Precio Venta</label>
            <input type="text" id="txtPrecioVenta" name="txtPrecioVenta" value="${ejbProducto.getProducto().precioVenta}"/>
            <label for="dateFechaVencimiento">Fecha de Vencimiento</label>
            <input type="date" id="dateFechaVencimiento" name="dateFechaVencimiento" value="${ejbProducto.getProducto().fechaVencimiento}"/>
            <label for="txtIdProducto">Estado</label>
            <input type="text" id="txtEstado" name="txtEstado" value="${ejbProducto.getProducto().estado}"/> 
            <input type="submit" value="Actualizar Datos"/>
            <br/>
            <br/>
            <a href="index.jsp">Volver</a>
        </form>
    </body>
</html>
