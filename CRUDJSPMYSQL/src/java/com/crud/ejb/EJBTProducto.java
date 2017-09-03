/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.ejb;

import com.mysql.jdbc.Connection;
import com.crud.conexion.ConexionDB;
import com.crud.dao.DAOTProducto;
import com.crud.encapsulamiento.TProducto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author FABAME
 */

@Stateless
public class EJBTProducto {

    private transient Connection conexion;
    private TProducto tProducto;
    private List<TProducto> listadoTProductos;
    private final DAOTProducto daoTProducto;

    public EJBTProducto() {
        this.tProducto = new TProducto();
        this.listadoTProductos = new ArrayList<>();
        this.daoTProducto = new DAOTProducto();
    }

    public boolean insert() {
        boolean valorRetornado = false;
        try {
            this.conexion = ConexionDB.conectar();
            this.tProducto.setEstado(true);
            valorRetornado = this.daoTProducto.insert(this.conexion, this.tProducto);
            this.conexion.close();
        } catch (Exception ex) {
            valorRetornado = false;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return valorRetornado;
        }
    }

    public boolean getByIdProducto(String idProducto) {
        boolean valorRetornado = false;
        try {
            this.conexion = ConexionDB.conectar();
            this.tProducto = this.daoTProducto.getByIdProducto(this.conexion, idProducto);
            this.conexion.close();
            valorRetornado = true;
        } catch (Exception ex) {
            valorRetornado = false;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return valorRetornado;
        }
    }

    public boolean getAll() {
        boolean valorRetornado = false;
        try {
            this.conexion = ConexionDB.conectar();
            this.listadoTProductos = this.daoTProducto.getAll(this.conexion);
            this.conexion.close();
            valorRetornado = true;
        } catch (Exception ex) {
            valorRetornado = false;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return valorRetornado;
        }
    }

    public boolean update() {
        boolean valorRetornado = false;
        try {
            this.conexion = ConexionDB.conectar();
            this.tProducto.setEstado(true);
            valorRetornado = daoTProducto.update(this.conexion, this.tProducto);
            this.conexion.close();
        } catch (Exception ex) {
            valorRetornado = false;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return valorRetornado;
        }
    }

    public boolean delete(String idProducto) {
        boolean valorRetornado = false;
        try {
            this.conexion = ConexionDB.conectar();
            this.tProducto.setEstado(true);
            valorRetornado = daoTProducto.delete(this.conexion, idProducto);
            this.conexion.close();
        } catch (Exception ex) {
            valorRetornado = false;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return valorRetornado;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public TProducto getTProducto() {
        return tProducto;
    }

    public void setTProducto(TProducto tProducto) {
        this.tProducto = tProducto;
    }

    public List<TProducto> getListadoTProductos() {
        return listadoTProductos;
    }

    public void setListadoTProductos(List<TProducto> listadoTProductos) {
        this.listadoTProductos = listadoTProductos;
    }
}
