<%-- 
    Document   : EditProfileInDb
    Created on : Apr 5, 2011, 9:12:17 AM
    Author     : islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="REFRESH" content="5;url=index.jsp"/>
<title>Zion Narrows   by Free CSS Templates</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />

</head>
<body>

<jsp:include page="LoadHeader" />
<jsp:useBean class="pagesbeans.SignUpBean" id="user" scope="request"/>
<jsp:setProperty property="*" name="user"/>
<jsp:include page="EditProfileInDb"/>
<div id="menu">
    <ul>
        <li class="current_page_item"><a href="#">Home</a></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li><a href="#">Prfile</a></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li><li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li><a href="#">My cart</a></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li><a href="#">contact us</a></li>
    </ul>
</div>
<!-- end #menu -->
<div id="page">
    <div id="page-bgtop">
        <div id="page-bgbtm">
            <div id="content">
                <div class="post">
                    <h2 class="title">Welcome Page</h2>
                    <div class="entry">
                        <br><br><br><br><br><br><br><br><br>
                        <center><h1><font color="green"><b>Your Account has been edited successfully </b></font></h1></center>

                        <br><br><br><br><br><br><br><br><br><br><br><br>

                        <br><br><br><br><br><br><br><br><br><br><br><br>
                    </div>
                </div>

                <div style="clear: both;">&nbsp;</div>
            </div>
            <!-- end #content -->
             <jsp:include page="Category.jsp" />
            <!-- end #sidebar -->
            <div style="clear: both;">&nbsp;</div>
        </div>
    </div>
</div>
<%@include file="Footer.jsp" %>
<!-- end #page -->
       