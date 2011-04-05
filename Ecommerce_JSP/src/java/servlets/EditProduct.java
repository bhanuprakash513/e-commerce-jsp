/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import databeans.Categories;
import databeans.Products;
import databeans.model.AdminService;
import databeans.model.AdminService_Interface;
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
public class EditProduct extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
          Products product = null;
          UserService_Interface user=UserService.getServiceInstance();
          ArrayList<Products> products=user.getAllProducts();
           AdminService_Interface admin=AdminService.getServiceInstance();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Integer parser=new Integer(request.getParameter("param"));
            int id;
            id=parser;
            for(Products p:products){
                if(p.getProductId()==id)
                {
                    product=p;
                    break;
                }
            }
            out.println("<tr><td><b>Product Name</b></td><td><input type='text' size='20' id='txt1' onblur='productName1();' name='productName' value='"+product.getName()+"'><span id='sp1'></span></td></tr>");
            out.println("<tr><td><b>Price</b></td><td><input type='text' size='20' id='txt2' onblur='price();' name='priceValue' value='"+product.getPrice()+"'><span id='sp2'></span></td></tr>");
            out.println("<tr><td><b>Quantity</b></td><td><input type='text' size='20' id='txt3' onblur='quantities();' name='quantity' value='"+product.getQuantity()+"'><span id='sp3'></span></td></tr>");
            out.println("<tr><td><b>Product Picture</b></td><td><input type='file' size='20' id='txt4' name='picturePath'><span id='sp4'></span></td></tr>");
            out.println("<tr><td><b>Picture Description</b></td><td><input type='Text' size='40' id='txt5' name'description' value='"+product.getDescription()+"'><span id='sp5'></span></td></tr>");
            //out.println("<select id='sel1' name='category' value='"+product.getCategories().getName()+"'>");
//<select id="sel1" name="category">
                                                //<option value="choose the category">Choose The Category</option>
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditProduct</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProduct at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
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
