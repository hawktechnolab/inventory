/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.servlet;

import com.hawk.inventory.delegate.FacadeEntityDelegate;
import com.hawk.inventory.delegate.GenericEntityFacadeDelegate;
import com.hawk.inventory.entity.BrandEntity;
import com.hawk.log.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nisheeth Shah
 */
@WebServlet(name = "CentralController", urlPatterns = {"/central"})
public class CentralController extends HttpServlet {

    private static final Logger LOGGER = new Logger(CentralController.class);

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
        response.setContentType("text/plain;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CentralController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CentralController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
            out.println(new FacadeEntityDelegate().count());
            out.println(new GenericEntityFacadeDelegate<BrandEntity>(BrandEntity.class).count());
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
