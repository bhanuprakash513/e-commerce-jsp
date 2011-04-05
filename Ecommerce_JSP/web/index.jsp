<%--
    Document   : index
    Created on : 26/03/2011, 09:22:26 ص
    Author     : Mohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="page">
            <div id="page-bgtop">
               <div id="page-bgbtm">

                   <%
                   HttpSession se = request.getSession();
                   if (se.getAttribute("status")!= null){
                       if(se.getAttribute("status").toString().equals("user"))
                            pageContext.include("HeaderUser.jsp");
                       else if (se.getAttribute("status").toString().equals("admin"))
                            pageContext.include("HeaderAdmin.jsp");
                      else
                            pageContext.include("Header.jsp");

                   }
                   else
                   {
                       pageContext.include("Header.jsp");
                   }
                   %>

                   <jsp:include page="Category.jsp" />
                   <jsp:include page="product.jsp" >
                        <jsp:param name="catId" value="5"/>
                   </jsp:include>
                   </div>
            </div>
        </div>
    </body>
</html>


