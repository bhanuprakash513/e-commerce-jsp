/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import databeans.Transactions;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mahmoud
 */
public class ShowCart extends HttpServlet {
   
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
            UserService_Interface user = UserService.getServiceInstance();
            HttpSession session = request.getSession();
            int userID = (Integer)session.getAttribute("uid");
            int cartID = (Integer)session.getAttribute("cartID");
            Set<Transactions> set = user.getCartByID(cartID).getTransactionses();
//            request.setAttribute("transactions",
//                    (Set<Transactions>)user.getCartByID(cartID).getTransactionses());
            out.println("<div class=\"post\">");
            out.println("<h2 class=\"title\"><p> Cart </p></h2>");
            out.println("<div class=\"entry\">");

            out.println("<table border='2'>");
            out.println("<tr>");
            out.println("<th>item</th>");
            out.println("<th>quantity</th>");
            out.println("<th>price</th>");
            out.println("</tr>");
            for(Transactions t : set){
                int price = t.getQuantity() * t.getProducts().getPrice();
                out.println("<tr>");
                    out.println("<td>");
                        out.println(t.getProducts().getName());
                    out.println("</td>");
                    out.println("<td>");
                        out.println(t.getQuantity());
                    out.println("</td>");
                    out.println("<td>");
                        out.println(price + "$");
                    out.println("</td>");
                out.println("</tr>");

            }
            out.println("</table>");
           // out.println("</div>");
           // out.println("</div>");
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
