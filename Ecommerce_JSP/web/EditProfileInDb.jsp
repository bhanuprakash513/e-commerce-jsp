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

<div id="wrapper">
	<div id="header">
		<div id="logo">
			<img src="images/imageExample.gif" width="120" height="80">
		</div>
		<div id="search">
			<form method="get" action="">
				<fieldset>
				<b><a href="#"><font color="white">sign up</font></a></b>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<b><a href="#"><font color="white">sign in</font></a></b>
				</fieldset>
			</form>
		</div>
	</div>
    </div>
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
            <div id="sidebar">
                <ul>
                    <li>
                    </li>
                    <li>
                        <h2>Categories</h2>
                        <ul>
                            <jsp:include page="ExtractAllCategoriesInSide"/>

                        </ul>
                    </li>
                    <li>

                    </li>
                    <li>

                    </li>
                </ul>
            </div>
            <!-- end #sidebar -->
            <div style="clear: both;">&nbsp;</div>
        </div>
    </div>
</div>
<%@include file="Footer.jsp" %>
<!-- end #page -->
       