<%-- 
    Document   : cart
    Created on : Apr 4, 2011, 11:08:21 PM
    Author     : mahmoud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cart</title>
    </head>
    <body>
          <jsp:include page="LoadHeader" />

          <div id="page">
            <div id="page-bgtop">
               <div id="page-bgbtm">



                   <jsp:include page="Category.jsp" />
                   <jsp:include page="ShowCart"/>
                        <form action="SubmitCart">
                            <input type="submit" value="Buy">
                        </form>
                   </div>
            </div>
        </div>
    </body>
</html>

        