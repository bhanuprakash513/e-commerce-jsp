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
<script>
    var flagpname=false;
    var flagprice=false;
    var flagquantity=false;
    function category()
    {
        if (document.getElementById("txt1").value == "")
        {

            document.getElementById("sp1").innerHTML = "u must enter the category name";
            flagpname=false;
            return false;
        }
        else
            if(document.getElementById("txt1").value.length<6 || document.getElementById("txt1").value.length>14)
        {
            document.getElementById("sp1").innerHTML = "the number of characters must be between 6 and 14 character";
            flagpname=false;
            return false;
        }
        else
        {

            document.getElementById("sp1").innerHTML = "";
            flagpname=true;
            return true;
        }

    }

</script>

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
                    <h2 class="title">Admin Product</h2>
                    <div class="entry">
                        <br>
                        <form name="lab3" action="index.jsp" onsubmit="return category()">
                            <table>
                                <tr><td><b>Category Name</b></td><td><input type="text" size="20" id="txt1"  name="categoryName"><span id="sp1"></span></td></tr>
                                <tr><td>&nbsp;&nbsp; </td><td></td> &nbsp;&nbsp;</tr>
                                <tr><td> &nbsp;&nbsp;</td><td></td> &nbsp;&nbsp;</tr>
                                <tr><td align="center"<input type="submit" value="Add"></td><td></td><td></td></tr>

                            </table>

                        </form>
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
                            <li><a href="#">Aliquam libero</a></li>
                            <li><a href="#">Consectetuer adipiscing elit</a></li>
                            <li><a href="#">Metus aliquam pellentesque</a></li>
                            <li><a href="#">Suspendisse iaculis mauris</a></li>
                            <li><a href="#">Urnanet non molestie semper</a></li>
                            <li><a href="#">Proin gravida orci porttitor</a></li>
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
