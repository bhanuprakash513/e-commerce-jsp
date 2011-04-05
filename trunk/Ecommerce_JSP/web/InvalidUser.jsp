<%--
    Document   : AdminMainPage
    Created on : Mar 30, 2011, 9:12:17 PM
    Author     : islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Zion Narrows
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20102110

-->

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="REFRESH" content="5;url=SignIn.jsp"/>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
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
                    <h2 class="title">Invalid</h2>
                    <div class="entry">
                        <br>
                        <h1>invalid user name and password</h1>
                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
                            <br><br><br><br><br><br><br><br><br>
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
