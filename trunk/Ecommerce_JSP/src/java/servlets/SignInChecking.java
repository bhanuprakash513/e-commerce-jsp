/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import databeans.Bills;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author islam
 */
public class SignInChecking extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ServletConfig myconfig;

    @Override
    public void init(ServletConfig config){
        myconfig = config;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        UserService_Interface admin = UserService.getServiceInstance();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session=request.getSession(true);//cuz some one can invoke the sign in page directly which happen in facebook
            String name,password;
            name=request.getParameter("name");
            password=request.getParameter("password");
            System.out.println(name);
            System.out.println(password);
            //checking if the user is admin
            if(name.equals(myconfig.getInitParameter("admin")) && password.equals(myconfig.getInitParameter("password"))){
                session.setAttribute("status", new String("admin"));

//                session.setAttribute("uid", admin.getUserID(name));
//                int billID = 0;
//                for(Bills bill : (Set<Bills>)admin.getUser(admin.getUserID(name)).getBillses()){
//                    if(!bill.isFinal_()){
//                        billID = bill.getBillId();
//                    }
//                }
//                session.setAttribute("cartID", billID);

                //send redirect in order to make the browser take the id if the the admin invoked it directly
                response.sendRedirect("WelcomeAdmin.jsp");
            }
            //checking if it is an ordinary user
            else if(admin.signIn(name, password)){
                session.setAttribute("status", new String("user"));
                session.setAttribute("uid", admin.getUserID(name));
                int billID = 0;
                for(Bills bill : (Set<Bills>)admin.getUser(admin.getUserID(name)).getBillses()){
                    if(!bill.isFinal_()){
                        billID = bill.getBillId();
                    }
                }
                session.setAttribute("cartID", billID);
                //send redirect in order to make the browser take the id if the the admin invoked it directly
                response.sendRedirect("WelcomeUser.jsp");
            }
            //anonymous user
            else{
                 //session.setAttribute("status", new String("guest"));
                //send redirect in order to make the browser take the id if the the admin invoked it directly
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                out.println("barraaaaaaaa");
                rd.include(request, response);
//                 response.sendRedirect("ViewAllProducts.jsp");
            }

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