package servlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.oreilly.servlet.MultipartWrapper;
import databeans.Categories;
import databeans.Products;
import databeans.model.AdminService;
import databeans.model.AdminService_Interface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pagesbeans.ProductBean;

/**
 *
 * @author islam
 */
/**
 * this servlet add the product to the db and do the work of the jsp(productaddingindb) in order not to write a acod in the jsp page
 * @author islam
 */
public class AddProductToDb extends HttpServlet {
   Products pdata;
   ProductBean ppage;
   Categories c;
   AdminService_Interface admin=AdminService.getServiceInstance();
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
        String picname = "";
        try {
            ppage=(ProductBean)request.getAttribute("product");
            pdata = new Products();
            pdata.setDescription(ppage.getDescription());
            pdata.setName(ppage.getProductName());
            pdata.setPrice(ppage.getPriceValue());
            if(request instanceof MultipartWrapper){
                out.println("hhhhhhhhhhhhhhhhhhhhhhhh");
                MultipartWrapper request1=(MultipartWrapper) request;
                File f=request1.getFile(request.getParameter("picturePath"));
                String path=request.getSession().getServletContext().getRealPath("images");
                picname=f.getName();
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream fos=new FileOutputStream(path+"/"+picname);
                int i=0;
                while((i=fis.read())!=0){
                    fos.write(i);
                }
            }
            
         //out.write( data );
            pdata.setPictureLink(picname);
            pdata.setQuantity(ppage.getQuantity());
            c=admin.getCategory(ppage.getCategory());
            pdata.setCategories(c);
            admin.addProduct(pdata);

            //pdata.setName(null);

            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddProductToDb</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProductToDb at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            //out.close();
//            admin=null;
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
