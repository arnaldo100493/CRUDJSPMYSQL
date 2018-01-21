<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : 5/08/2015, 11:50:13 PM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Productos</title>
        <script>
            function actualizar(idProducto) {
                window.location.href = "./update?idProducto=" + idProducto;
            }
            function borrar(idProducto) {
                var r = confirm("¿Esta seguro que desea eliminar este producto?");
                if (r === true) {
                    window.location.href = "./delete?idProducto=" + idProducto;
                }
            }

        </script>
    </head>
    <body>
        <h1>Listado de Productos</h1>
        <jsp:useBean id="ejbTProducto" scope="request" class="com.crud.ejb.EJBTProducto"/>
        <table border="1">
            <thead>
                <tr>
                    <th>ID PRODUCTO</th>
                    <th>NOMBRE PRODUCTO</th>
                    <th>PRECIO VENTA</th>
                    <th>FECHA VENCIMIENTO</th>
                    <th>ESTADO</th>
                    <th>FECHA REGISTRO</th>
                    <th>FECHA MODIFICACIÓN</th>
                    <th colspan="2">ACCIÓN</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${ejbTProducto.listadoTProductos}">
                    <tr>
                        <td>${item.getIdProducto()}</td>
                        <td>${item.getNombreProducto()}</td>
                        <td>${item.getPrecioVenta()}</td>
                        <td>${item.getFechaVencimiento()}</td>
                        <td>${item.isEstado()?"Activo":"Desactivado"}</td>
                        <td>${item.getFechaRegistro()}</td>
                        <td>${item.getFechaModificacion()}</td>
                        <td><button id="${item.getIdProducto()}" onclick="actualizar(this.id);">Editar</button></td>
                        <td><button id="${item.getIdProducto()}" onclick="borrar(this.id);">Borrar</button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br/>
        <a href="index.jsp">Volver</a>
    </body>
</html>
