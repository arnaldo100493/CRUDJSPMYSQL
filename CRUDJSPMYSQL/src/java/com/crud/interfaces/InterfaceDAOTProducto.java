/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.interfaces;

import com.mysql.jdbc.Connection;
import com.crud.encapsulamiento.TProducto;
import java.util.List;

/**
 *
 * @author FABAME
 */
public interface InterfaceDAOTProducto {

    public boolean insert(Connection conexion, TProducto tProducto) throws Exception;

    public TProducto getByIdProducto(Connection conexion, String idProducto) throws Exception;

    public List<TProducto> getAll(Connection conexion) throws Exception;

    public boolean update(Connection conexion, TProducto tProducto) throws Exception;

    public boolean delete(Connection conexion, String idProducto) throws Exception;

}
