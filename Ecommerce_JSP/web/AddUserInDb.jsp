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
<jsp:include page="LoadHeader" />
<jsp:useBean class="pagesbeans.SignUpBean" id="user" scope="request"/>
<jsp:setProperty property="*" name="user"/>

<jsp:forward page="AddUserToDb"/>
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
                        <center><h1><font color="green"><b>Welcome you are now a member in the E-Commerce site </b></font></h1></center>
                        <center><h4><font color="green"><b>You Should sign in in order to can buy from the site </b></font></h4></center>
                        <br><br><br><br><br><br><br><br><br><br><br><br>

                        <br><br><br><br><br><br><br><br><br><br><br><br>
                    </div>
                </div>

                <div style="clear: both;">&nbsp;</div>
            </div>
            <!-- end #content -->
           <jsp:include page="Category.jsp" />
            <div style="clear: both;">&nbsp;</div>
        </div>
    </div>
</div>
<%@include file="Footer.jsp" %>
<!-- end #page -->