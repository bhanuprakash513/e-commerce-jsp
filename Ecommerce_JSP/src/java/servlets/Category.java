/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import databeans.*;
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
 * @author Mohamed
 */
public class Category extends HttpServlet {

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

        /////////////////////////////////////////
        UserService_Interface user = UserService.getServiceInstance();
        ArrayList<Categories> list = user.getAllCategories();
        for(Categories cat : list){
            out.println("<li><a href=\"Product?catId="+cat.getId()
                        +"\">"+cat.getName()+"</a></li>");
        }
//        Categories[] categoryBeanArr ;
//        categoryBeanArr = new Categories[5];
//        out.println(categoryBeanArr.length);
//        for (int i =0 ;i<categoryBeanArr.length;i++)
//        {
//            Categories cat = new Categories();
//            cat.setId(4);
//            cat.setName("ahmed");
//            categoryBeanArr[i] = cat;
//        }
//
//        ////////////////////////////////////////////
//
//
//        try {
//            for(int i=0 ;i<categoryBeanArr.length-1 ;i++)
//            {
//                out.println("<li><a href=\"Product?catId="+categoryBeanArr[i].getId()
//                        +"\">"+categoryBeanArr[i].getName()+"</a></li>");
//            }


            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Category</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Category at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
//        } finally {
//        //    out.close();
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
