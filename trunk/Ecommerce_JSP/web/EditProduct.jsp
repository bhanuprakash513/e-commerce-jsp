<%--
    Document   : AdminMainPage
    Created on : Mar 30, 2011, 9:12:17 PM
    Author     : islam
--%>

<%@page import="databeans.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="databeans.model.UserService"%>
<%@page import="databeans.model.UserService_Interface"%>
<%@page import="databeans.model.AdminService_Interface"%>
<%@page import="databeans.model.AdminService"%>
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
<%@taglib prefix="c"uri="http://java.sun.com/jstl/core" %>
<%@include file="Header.jsp" %>
<script>
    var flagpname=false;
    var flagprice=false;
    var flagquantity=false;
     var flagfile=false;
     var flagdescription=false;
    function productName1()
    {
        if (document.getElementById("txt1").value == "")
        {

            document.getElementById("sp1").innerHTML = "u must enter the product name";
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
    function describe()
    {
        if (document.getElementById("txt5").value == "")
        {

            document.getElementById("sp5").innerHTML = "u must enter the product decribtion";
            flagdescription=false;
            return false;
        }
        else
            if(document.getElementById("txt5").value.length<6 || document.getElementById("txt5").value.length>40)
        {
            document.getElementById("sp5").innerHTML = "the number of characters must be between 6 and 40 character";
            flagdescription=false;
            return false;
        }
        else
        {

            document.getElementById("sp1").innerHTML = "";
            flagdescription=true;
            return true;
        }

    }
    function price()
    {
        if (document.getElementById("txt2").value == "") {
            //flag=false;
            flagprice=false;
            document.getElementById("sp2").innerHTML = "u must enter the product price";
            return false;
        }
        else
            if (isNaN(document.getElementById("txt2").value)) {
                //flag=false;
                //alert("eshta");
                flagprice=false;
                document.getElementById("sp2").innerHTML = "u shouldnt enter a character";
                return false;
            }

        var m = parseInt(document.getElementById("txt2").value);
        if (m < 0) {
            document.getElementById("sp2").innerHTML = "the price should not be a negative number";
            flagprice=false;
            return false;
        }
        else {
            document.getElementById("sp2").innerHTML="";
            flagprice=true;
            return true;
        }


    }
    function quantities()
    {
        if (document.getElementById("txt3").value == "") {
            //flag=false;
            flagquantity=false;
            document.getElementById("sp3").innerHTML = "u must enter the product quantity";
            return false;
        }
        else
            if (isNaN(document.getElementById("txt3").value)) {
                //flag=false;
                //alert("eshta");

                document.getElementById("sp3").innerHTML = "u shouldnt enter a character";
                flagquantity=false;
                return false;
            }

        var m = parseInt(document.getElementById("txt3").value);
        if (m < 0) {
            document.getElementById("sp3").innerHTML = "the quantity should not be a negative number";
            flagquantity=false;
            return false;
        }
        else {
            document.getElementById("sp3").innerHTML="";
            flagquantity=true;
            return true;
        }


    }


function Validate() {
             var _validFileExtensions = [".jpg", ".jpeg", ".bmp", ".gif", ".png"];
            var sFileName = document.getElementById("txt4").value;
            if (sFileName.length > 0) {
                var blnValid = false;
                for (var j = 0; j < _validFileExtensions.length; j++) {
                    var sCurExtension = _validFileExtensions[j];
                    if (sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase() == sCurExtension.toLowerCase()) {
                        blnValid = true;
                        break;
                    }
                }

                if (!blnValid) {
                    document.getElementById("sp4").innerHTML = "Sorry, " + sFileName + " is invalid, allowed extensions are: " + _validFileExtensions.join(", ");
                    //alert("Sorry, " + sFileName + " is invalid, allowed extensions are: " + _validFileExtensions.join(", "));
                    return false;
                }
                else{
                    document.getElementById("sp4").innerHTML="";
                    return true;
                }
            }
            else{
                document.getElementById("sp4").innerHTML="plz choose a picture for the product";
                return false;
            }
        }
        function check(){

                            flagfile=Validate();
                            //alert("flagpname="+flagpname);
                            //alert("flagprice="+flagprice);
                            //alert("flagquantity="+flagquantity);
                            //alert("flagf="+flagfile);
				if(flagpname && flagprice && flagquantity && flagfile && flagdescription)

				return true;
				else
				return false;
			}

</script>
<%! UserService_Interface user=UserService.getServiceInstance();%>
<%!ArrayList<Categories> categories=user.getAllCategories();%>
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
                        <form name="lab3" action="ProductAddingInDb.jsp" onsubmit="productName1();price();quantities();describe();return check();">
                            <table>
                                <%--<jsp:include page="EditProduct"/>--%>
                               <%@include file="EditProduct" %>
                                <tr><td align="left" colspan="2"></><b></>Nationality</b></td></tr>
                                <tr><td colspan="2">
                                        <div>
                                            <select id="sel1" name="category">
                                                <option value="choose the category">Choose The Category</option>

                                                <jsp:include page="ExtractAllCategories"/>

                                            </select>
                                        </div>
                                    </td></tr>
                                <tr><td><input type="submit" value="submit">

                            </table>
                        </form>				</div>
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
