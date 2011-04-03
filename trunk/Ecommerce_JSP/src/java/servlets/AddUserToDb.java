/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import databeans.Users;
import databeans.model.AdminService;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pagesbeans.SignUpBean;

/**
 *
 * @author islam
 */
public class AddUserToDb extends HttpServlet {

    Users pdata;
    SignUpBean ppage;
    //Categories c;
    UserService_Interface admin = UserService.getServiceInstance();

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
            ppage = (SignUpBean) request.getAttribute("user");
            UserService_Interface user = UserService.getServiceInstance();
            if(!user.isNameExists(ppage.getEmail())){
                pdata = new Users();
                SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
                Date convertedDate;
                System.out.println(ppage.getBirthDay());
                convertedDate = dateFormat.parse(ppage.getBirthDay());
                Integer parser=new Integer(ppage.getCredit());
                Double credit;
                credit=parser.doubleValue();

                pdata.setName(ppage.getName());
                pdata.setEmail(ppage.getEmail());
                pdata.setDob(convertedDate);
                pdata.setJob(ppage.getJob());
                pdata.setPassword(ppage.getPassword());
                pdata.setCredit(credit);
                pdata.setInterests(ppage.getInterests());

                admin.signUp(pdata);
//                RequestDispatcher rd = request.getRequestDispatcher("SignUpPage");
//                out.println("user already registered before");
//                rd.include(request, response);
            }
            else{
                //out.println("user already registered before");
                request.setAttribute("error", "user already registered before");
                RequestDispatcher rd = request.getRequestDispatcher("SignUpPage.jsp");
                rd.include(request, response);
            }
            //response.sendRedirect("index.jsp");
            } catch (Exception ex) {
            Logger.getLogger(AddUserToDb.class.getName()).log(Level.SEVERE, null, ex);
//            RequestDispatcher rd = request.getRequestDispatcher("SignUpPage");
//            out.println("user already registered before");
//            rd.include(request, response);
        }finally {
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