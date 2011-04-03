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
<%@include file="Header.jsp" %>
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
                    <h2 class="title">User Main Page</h2>
                    <div class="entry">
                        <br>
                        <form name="lab3" action="index.jsp" onsubmit="return all();">
		<table>
		<tr><td><b>Name</b></td><td><input type="text" size="20" id="txt1" name="name"><span id="sp1"></span></td></tr>
		<tr><td><b>password</b></td><td><input type="password" size="20" id="txt2"  name="password"><span id="sp2"></span></td></tr>
                <br>
                <jsp:include page="SignInChecking"/>
		<tr><td><input type="submit" value="Sign Up" >
		</table>
		</form>
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
