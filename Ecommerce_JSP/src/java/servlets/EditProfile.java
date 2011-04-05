/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import databeans.Users;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mahmoud
 */
public class EditProfile extends HttpServlet {

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
        UserService_Interface usercontrol = UserService.getServiceInstance();
        try {
            Integer parser = new Integer(request.getSession().getAttribute("uid").toString());
            int id;
            id = parser;
            Users user = usercontrol.getUser(id);
            out.println("<tr><td><b>Name</b></td><td><input type='text' size='20' id='txt1' onblur='name1()' name='name'value='" + user.getName() + "'><span id='sp1'></span></td></tr>");
            out.println("<tr><td><b>Email</b></td><td><input type='text' size='20' id='txt2' onblur='email1()' name='email' value='" + user.getEmail() + "'><span id='sp2'></span></td></tr>");
            out.println("<tr><td><b>Birthday</b></td><td><input type='text' size='20' id='txt3' onblur='isDate()' name='birthDay' value='" + user.getDob().toString() + "'><span id='sp3'>mm/dd/yyyy</span></td></tr>");

            out.println("<tr><td><b></>Credit Limit</b></td><td><input type='text' size='20' id='txt5' onblur='credit1()' name='credit' value='" + user.getCredit() + "'><span id='sp5'></span></td></tr>");

            out.println("<tr><td><b>Job</b></td><td><input type='text' size='20' id='txt6' name='job' onblur='job1()' value='" + user.getJob() + "'><span id='sp6'></span></td></tr>");
            out.println("<tr><td><b>interests</b></td><td><input type='text' size='20' id='txt15' name='interests' onblur='interests1()' value='" + user.getInterests() + "'><span id='sp15'></span></td></tr>");
            out.println("<tr><td><b>Password</b></td><td><input type='password' size='20' id='txt7' onblur='validatePwd()' name='password' value='" + user.getPassword() + "'><span id='sp7'></span></td></tr>");
            out.println("<tr><td><b>Confirm Password</b></td><td><input type='password' size='20' id='txt8' onblur='confirm1()' name='confirm' value='" + user.getPassword() + "'><span id='sp8'></span></td></tr>");
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
