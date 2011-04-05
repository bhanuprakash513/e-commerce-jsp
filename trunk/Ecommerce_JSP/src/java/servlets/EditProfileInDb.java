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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pagesbeans.SignUpBean;

/**
 *
 * @author mahmoud
 */
public class EditProfileInDb extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {

    Users pdata;
    SignUpBean ppage;
    //Categories c;
    UserService_Interface admin = UserService.getServiceInstance();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int id =(Integer)request.getSession().getAttribute("uid");
            ppage = (SignUpBean) request.getAttribute("user");
            UserService_Interface user = UserService.getServiceInstance();
            pdata = new Users();
                SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
                Date convertedDate;
                System.out.println(ppage.getBirthDay());
                convertedDate = dateFormat.parse(ppage.getBirthDay());
                Integer parser=new Integer(ppage.getCredit());
                Double credit;
                credit=parser.doubleValue();
                pdata.setUid(id);
                pdata.setName(ppage.getName());
                pdata.setEmail(ppage.getEmail());
                pdata.setDob(convertedDate);
                pdata.setJob(ppage.getJob());
                pdata.setPassword(ppage.getPassword());
                pdata.setCredit(credit);
                pdata.setInterests(ppage.getInterests());
                admin.editUser(pdata);
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditProfileInDb</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProfileInDb at " + request.getContextPath () + "</h1>");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(EditProfileInDb.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(EditProfileInDb.class.getName()).log(Level.SEVERE, null, ex);
        }
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
