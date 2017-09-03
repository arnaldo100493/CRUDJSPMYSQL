/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.encapsulamiento;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author FABAME
 */
public class TProducto {

    private int idProducto;
    private String nombreProducto;
    private BigDecimal precioVenta;
    private Date fechaVencimiento;
    private boolean estado;
    private Date fechaRegistro;
    private Date fechaModificacion;

    public TProducto() {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.precioVenta = null;
        this.fechaVencimiento = null;
        this.estado = false;
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }

    public TProducto(String nombreProducto, BigDecimal precioVenta, Date fechaVencimiento, boolean estado, Date fechaRegistro, Date fechaModificacion) {
        this.idProducto = 0;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public TProducto(int idProducto, String nombreProducto, BigDecimal precioVenta, Date fechaVencimiento, boolean estado, Date fechaRegistro, Date fechaModificacion) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public TProducto(TProducto tProducto) {
        this.idProducto = tProducto.getIdProducto();
        this.nombreProducto = tProducto.getNombreProducto();
        this.precioVenta = tProducto.getPrecioVenta();
        this.fechaVencimiento = tProducto.getFechaVencimiento();
        this.estado = tProducto.isEstado();
        this.fechaRegistro = tProducto.getFechaRegistro();
        this.fechaModificacion = tProducto.getFechaModificacion();
    }

    @Override
    public String toString() {
        return "TProducto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", fechaVencimiento=" + fechaVencimiento + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + ", fechaModificacion=" + fechaModificacion + '}';
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
