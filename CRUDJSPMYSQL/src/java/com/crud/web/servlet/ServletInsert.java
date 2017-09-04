/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.web.servlet;

import com.crud.ejb.EJBTProducto;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FABAME
 */
@WebServlet(name = "ServletInsert", urlPatterns = {"/servletInsert", "/insert"})
public class ServletInsert extends HttpServlet {

    @EJB
    private EJBTProducto ejbTProducto;

    public ServletInsert() {

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getMethod().equals("GET")) {
            request.getRequestDispatcher("insert.jsp").forward(request, response);
        }

        if (request.getMethod().equals("POST")) {
            this.ejbTProducto = new EJBTProducto();

            this.ejbTProducto.getTProducto().setNombreProducto(request.getParameter("txtNombreProducto"));
            this.ejbTProducto.getTProducto().setPrecioVenta(new BigDecimal(request.getParameter("txtPrecioVenta")));
            this.ejbTProducto.getTProducto().setFechaVencimiento(Date.valueOf(request.getParameter("dateFechaVencimiento")));

            String mensajeRespuesta;
            String mensajeError;
            
            boolean valorRetornado;
            
            valorRetornado = this.ejbTProducto.insert();

            if (valorRetornado) {
                mensajeRespuesta = "Inserción Correcta.";
                request.setAttribute("mensajeRespuesta", mensajeRespuesta);
                request.getRequestDispatcher("respuesta.jsp").forward(request, response);
            } else {
                mensajeError = "Error al tratar de insertar el producto.";
                request.setAttribute("mensajeError", mensajeError);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
