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
                   <jsp:include page="oneproduct.jsp" />
                   </div>
            </div>
        </div>
    </body>
</html>