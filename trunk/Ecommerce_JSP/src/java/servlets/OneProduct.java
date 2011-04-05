/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;
import databeans.Products;
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
public class OneProduct extends HttpServlet {
   
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


        int productId = Integer.valueOf(request.getParameter("productId"));

       UserService_Interface user = UserService.getServiceInstance();
        Products p = user.getProductByID(productId);
/*
        p.setDescription("sdfjknkjnknklnjlbnkljblbiklnbj jnsjknckdsnfijsdnfisdnfinsdifdsifusd dsnfisndifinsinsnf "
                + "fdsnfsoidfnsfnsfdnsufns");
        p.setPrice(6);
        p.setProductId(productId);
        p.setName("sfd");
        p.setQuantity(60);
        p.setPictureLink("http://localhost:8081/delete/images/1.jpg");
*/
        p.setPictureLink("images/1.jpg");
        try {
            out.println("<div class=\"post\">");
                out.println("<h2 class=\"title\"><p> <a href=\"\">"+p.getName()+"</a></h2>");
                out.println("<div class=\"entry\">");
                out.print("<form action= AddToCart.jsp?productId="+p.getProductId()+" method = \"POST\">"
                        + "<p align = center ><img src=\""+p.getPictureLink()+ "\"  height = 150 width =150 /></p>"
                        +"<strong> Price = " + p.getPrice()+"</strong>"+ " Discription : "
                        +p.getDescription());
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



        finally {
            out.close();
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
