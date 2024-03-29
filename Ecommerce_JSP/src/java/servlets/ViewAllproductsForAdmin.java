/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import databeans.Categories;
import databeans.Products;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author islam
 */
public class ViewAllproductsForAdmin extends HttpServlet {
    UserService_Interface user=UserService.getServiceInstance();
   ArrayList<Products> products=user.getAllProducts();
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            for(Products p:products){
                out.println("<tr><td>"+p.getName()+"</td><td>"
                        +p.getPrice()+"</td><td>"+p.getQuantity()+"</td><td>"
                        +p.getDescription()+"</td><td>"
                        +p.getCategories().getName()+"</td><td><img src='images/1.jpj' width='60' height='40'></td><td><a href='EditProduct.jsp?param="
                        
                        
                        +p.getProductId()+">Edit</a></td><td><a href='#'>Delete</a></td></tr>");




            }
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewAllproductsForAdmin</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewAllproductsForAdmin at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
            finally {
            //out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
