/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.crud.encapsulamiento.TProducto;
import com.crud.interfaces.InterfaceDAOTProducto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FABAME
 */

public class DAOTProducto implements InterfaceDAOTProducto {

    public DAOTProducto() {

    }

    @Override
    public boolean insert(Connection conexion, TProducto tProducto) throws Exception {
        boolean valorRetornado;
        String sql = "insert into tproducto(nombreProducto, precioVenta, fechaVencimiento, estado) values('" + tProducto.getNombreProducto() + "', '" + tProducto.getPrecioVenta() + "', '" + tProducto.getFechaVencimiento() + "', " + tProducto.isEstado() + ");";
        Statement statement;
        statement = (Statement) conexion.createStatement();
        statement.execute(sql);
        valorRetornado = true;
        statement.close();
        return valorRetornado;
    }

    @Override
    public TProducto getByIdProducto(Connection conexion, String idProducto) throws Exception {
        TProducto tProducto = null;
        String sql = "select * from tproducto where idProducto = '" + idProducto + "';";

        Statement statement;
        ResultSet resultSet;

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            tProducto = new TProducto();

            tProducto.setIdProducto(resultSet.getInt("idProducto"));
            tProducto.setNombreProducto(resultSet.getString("nombreProducto"));
            tProducto.setPrecioVenta(resultSet.getBigDecimal("precioVenta"));
            tProducto.setFechaVencimiento(resultSet.getDate("fechaVencimiento"));
            tProducto.setEstado(resultSet.getBoolean("estado"));
            tProducto.setFechaRegistro(resultSet.getDate("fechaRegistro"));
            tProducto.setFechaModificacion(resultSet.getDate("fechaModificacion"));

        }

        resultSet.close();
        statement.close();

        return tProducto;
    }

    @Override
    public List<TProducto> getAll(Connection conexion) throws Exception {
        List<TProducto> listadoTProductos = new ArrayList<>();
        TProducto tProducto;

        String sql = "select * from tproducto";

        Statement statement;
        ResultSet resultSet;

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            tProducto = new TProducto();

            tProducto.setIdProducto(resultSet.getInt("idProducto"));
            tProducto.setNombreProducto(resultSet.getString("nombreProducto"));
            tProducto.setPrecioVenta(resultSet.getBigDecimal("precioVenta"));
            tProducto.setFechaVencimiento(resultSet.getDate("fechaVencimiento"));
            tProducto.setEstado(resultSet.getBoolean("estado"));
            tProducto.setFechaRegistro(resultSet.getDate("fechaRegistro"));
            tProducto.setFechaModificacion(resultSet.getDate("fechaModificacion"));

            listadoTProductos.add(tProducto);
        }

        resultSet.close();
        statement.close();

        return listadoTProductos;
    }

    @Override
    public boolean update(Connection conexion, TProducto tProducto) throws Exception {
        boolean valorRetornado;
        String sql = "update tproducto set nombreProducto = '" + tProducto.getNombreProducto() + "', precioVenta = '" + tProducto.getPrecioVenta() + "', fechaVencimiento = '" + tProducto.getFechaVencimiento() + "', estado = " + tProducto.isEstado() + " where idProducto = '" + tProducto.getIdProducto() + "';";
        Statement statement;
        statement = (Statement) conexion.createStatement();
        statement.execute(sql);
        valorRetornado = true;
        statement.close();
        return valorRetornado;
    }

    @Override
    public boolean delete(Connection conexion, String idProducto) throws Exception {
        boolean valorRetornado;
        String sql = "delete from tproducto where idProducto = '" + idProducto + "'";
        Statement statement;
        statement = (Statement) conexion.createStatement();
        statement.execute(sql);
        valorRetornado = true;
        statement.close();
        return valorRetornado;
    }
}
