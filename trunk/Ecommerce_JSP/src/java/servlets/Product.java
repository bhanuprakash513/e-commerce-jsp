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
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohamed
 */
public class Product extends HttpServlet {

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

        request.getAttribute("catId");

        UserService_Interface user = UserService.getServiceInstance();
        ////////////////////////////////////////////////
        Set<Products> set = user.getCategoryProducts(1);
        for(Products p : set){

                out.println("<div class=\"post\">");
                out.println("<h2 class=\"title\"><p>" +"<a href = ShowProduct.jsp?productId="+p.getProductId()+">"+p.getName()+"</a></p></h2>");
                out.println("<div class=\"entry\">");
                out.print("<form action= AddToCart.jsp?productId="+p.getProductId()+" method = \"POST\">"
                        + "<img href = ShowProduct.jsp?productId="+p.getProductId()+" src="+p.getPictureLink()+ " height = 70 width =70 />"
                        +"<strong> Price = " + p.getPrice()+"</strong>"+ " Discription : "
                        +p.getDescription()+"<a href = ShowProduct.jsp?productId="+p.getProductId()+"><font color = \"blue\">...More->></font></a>" );
                out.println("<p align = right>"
                        + "<select name=quantity size=1>");
                out.println("<option name= "+0+" value= \""+1+"\">Quantity</option>");

                for(int x =1;x<p.getQuantity()+1;x++)
                {
                    out.println("<option name= "+x+" value= "+x+">"+x+" </option>");
                }
                out.print("</select>");
		out.println("<input type =\"submit\" value = \"Add to Cart\"/>");
                out.println("</form></div>");
		out.println("</div>");
}
        //////////////////////////////////////////////////////////////////////

//        ArrayList<Products> P = new ArrayList<Products>();
//        Products pro = new Products();
//        pro.setName("ahmed");
//        pro.setProductId(32);
//        pro.setPrice(6);
//        pro.setQuantity(10);
//        pro.setDescription("Some set implementations have restrictions on the "
//                + "elements that they may contain. For example, some implementations"
//                + " prohibit null elements, and some have restrictions on the types "
//                + " element whose completion would not result in the insertion of an "
//                + "ineligible element into the set may throw an exception or it may succeed, "
//                + "at the option of the implementation. Such exceptions are marked as "
//                + "in the specification for this interface. ");
//        pro.setPictureLink("http://localhost:8081/delete/images/1.jpg");
//        for(int i = 0 ; i <6;i++){
//            P.add(pro);
//        }
//        //////////////////////////////////////////////////
//
//
//        try {
//            for(int i =0 ; i <P.size();i++)
//            {
//                out.println("<div class=\"post\">");
//
//                out.println("<h2 class=\"title\"><p><input type=\"checkbox\" name=\"vehicle\" value=\""
//                        +P.get(i).getProductId()+"\" /> <a href=\"#\">"+P.get(i).getName()+"</a></h2>");
//                out.println("<div class=\"entry\">");
//                out.print(""
//                        + "<div><img src="+P.get(i).getPictureLink()+ " height = 80 width =80 />"
//                        +"<strong> Price = " + P.get(i).getPrice()+"</strong>"+ " Discription : "
//                        +P.get(i).getDescription()+"</div> ");
//                out.println("<p align = right>"
//                        + "<select name=mytextarea size=1>");
//                out.println("<option name= "+0+" value= "+"0"+">--Quantity-- </option>");
//
//                for(int x =1;x<P.get(i).getQuantity()+1;x++)
//                {
//                    out.println("<option name= "+x+" value= "+x+">"+x+" </option>");
//                }
//                out.println("</select></p>");
//		out.println("</div>");
//		out.println("</div>");
//            }
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
