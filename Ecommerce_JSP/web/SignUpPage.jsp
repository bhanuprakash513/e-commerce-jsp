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
			var flagname=false;
			var flagemail=false;
			var flagbirthday=false;
			//var flagjob=false;
			var flagcredit=false;
			var flagpassword=false;
			var flagconfirm=false;
			var flagsex=false;
			var flagnationality=false;
                        var flagadress=false;
                        var flaginterests=false;
                        var flagjob=false;
			//var flaginterests=false;
			//var flagaddres=false;
			function name1()
			{
					if (document.getElementById("txt1").value == "")
					 {

						document.getElementById("sp1").innerHTML = "u must enter ur name";
						flagname=false;
						return false;
					}
					else
					  if(document.getElementById("txt1").value.length<6 || document.getElementById("txt1").value.length>14)
					  {
					  	document.getElementById("sp1").innerHTML = "the number of characters must be between 6 and 14 character";
						flagname=false;
						return false;
					  }
					else
					{

						document.getElementById("sp1").innerHTML = "";
						flagname=true;
						return true;
					}

			}
                    function adress1()
			{
                            if (document.getElementById("txt4").value == "")
					 {

						document.getElementById("sp4").innerHTML = "u must enter your adress";
						flagadress=false;
						return false;
					}


					  else
                                              if(document.getElementById("txt4").value.length<6 || document.getElementById("txt4").value.length>14)
					  {
					  	document.getElementById("sp4").innerHTML = "the number of characters must be between 6 and 14 character";
						flagadress=false;
						return false;
					  }
					else
					{

						document.getElementById("sp4").innerHTML = "";
						flagadress=true;
						return true;
					}

			}
                    function interests1()
			{
                            if (document.getElementById("txt15").value == "")
					 {

						document.getElementById("sp15").innerHTML = "u must enter interests";
						flaginterests=false;
						return false;
					}


					  else
                                              if(document.getElementById("txt15").value.length<6 || document.getElementById("txt15").value.length>14)
					  {
					  	document.getElementById("sp15").innerHTML = "the number of characters must be between 6 and 14 character";
						flaginterests=false;
						return false;
					  }
					else
					{

						document.getElementById("sp15").innerHTML = "";
						flaginterests=true;
						return true;
					}

			}
                        function job1()
			{
                            if (document.getElementById("txt6").value == "")
					 {

						document.getElementById("sp6").innerHTML = "u must enter job";
						flagjob=false;
						return false;
					}


					  else
                                              if(document.getElementById("txt6").value.length<6 || document.getElementById("txt6").value.length>14)
					  {
					  	document.getElementById("sp6").innerHTML = "the number of characters must be between 6 and 14 character";
						flagjob=false;
						return false;
					  }
					else
					{

						document.getElementById("sp6").innerHTML = "";
						flagjob=true;
						return true;
					}

			}
			function email1()
			{
				var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;

				if (document.getElementById("txt2").value == "")
				{
					//flag = false;

					document.getElementById("sp2").innerHTML = "u must enter ur mail";
					flagemail=false;
				}
				else
					if(!(pattern.test(document.getElementById("txt2").value)))
					{
						//flag = false;

						document.getElementById("sp2").innerHTML = "u must enter a valid mail";
						flagemail=false;
					}
					else {
						//flag2= true;

						document.getElementById("sp2").innerHTML = "";
						flagemail=true;
					}


			}

			function t_field()
			{
				if(document.getElementById("txt3").value=="")
				{
					//flag=false;
					document.getElementById("sp3").innerHTML="u must enter ur telephone";
				}
				else if(isNaN(document.getElementById("txt3").value))
				{
					//flag=false;
					//alert("eshta");
					document.getElementById("sp3").innerHTML="u shouldnt enter a character";
				}
				else if((document.getElementById("txt3").value.length>10)|| (document.getElementById("txt3").value.length<6))
				{
				document.getElementById("sp3").innerHTML="u shouldnt enter a number of length between 6 and 10";
				}
				else
				{
					flag3=true;
					document.getElementById("sp3").value=="";
				}

			}
			function credit1()
			{
				if (document.getElementById("txt5").value == "") {
					//flag=false;
					flagcredit=false;
					document.getElementById("sp5").innerHTML = "u must enter ur crdit limit";
					return false;
				}
				else
					if (isNaN(document.getElementById("txt5").value)) {
						//flag=false;
						//alert("eshta");
						flagcredit=false;
						document.getElementById("sp5").innerHTML = "u shouldnt enter a character";
						return false;
					}

						var m = parseInt(document.getElementById("txt5").value);
						if (m < 0 || m > 500000) {
							document.getElementById("sp5").innerHTML = "must be less than this number";
							flagcredit=false;
							return false;
						}
						else {
							document.getElementById("sp5").innerHTML="";
							flagcredit=true;
							return true;
						}


			}
			function isDate(){
				var re = /^(\d{1,2})[\s\.\/-](\d{1,2})[\s\.\/-](\d{4})$/
				if (!re.test(document.getElementById("txt3").value)) {
					flagbirthday=false;
					document.getElementById("sp3").innerHTML="enter the birthday on the form mm/dd/yyyy";
					return false;
				}
  				var result = document.getElementById("txt3").value.match(re);
  				var m = parseInt(result[1]);
  				var d = parseInt(result[2]);
  				var y = parseInt(result[3]);
  				if(m < 1 || m > 12 || y < 1900 || y > 2100){
					flagbirthday=false;
				return false;
				document.getElementById("sp3").innerHTML="enter a valid birthday";
				}
  				if(m == 2){
         		var days = ((y % 4) == 0) ? 29 : 28;
  				}else if(m == 4 || m == 6 || m == 9 || m == 11){
          		var days = 30;
  				}else{
         		 var days = 31;
 				 }
				 if(d >= 1 && d <= days){
				 	document.getElementById("sp3").innerHTML="";
					flagbirthday=true;
				 	return true;

				 }
				 else{
				 	flagbirthday=false;
				 	document.getElementById("sp3").innerHTML="enter a valid birthday";
				 	return false;

				 }

				}
			function g_field()
			{
				//alert("hey");
				if (document.getElementsByName("sex")[0].checked == false && document.getElementsByName("sex")[1].checked == false) {
					//flag = false;
					alert("sex here false");
					flagsex=false;
					document.getElementById("sp9").innerHTML = "   u should choose ur sex";
					return false;
				}
				else {
					alert("sex here true");
					flag4 = true;
					flagsex=true;
					document.getElementById("sp9").innerHTML = "";
					return true;
				}

			}
				function na_field(){
					//alert("no way");
					if (document.getElementById("chk1").checked == false && document.getElementById("chk2").checked == false && document.getElementById("chk3").checked == false && document.getElementById("chk4").checked == false) {
						flaginterests=false;
						//alert("interest here is false");
						//flag = false;
						document.getElementById("sp10").innerHTML = "u should choose ur interests";
						return false;
					}
					else
					{
						alert("interest here is true");
						flaginterests=true;
						//flag5 = true;
						document.getElementById("sp10").innerHTML = "";
						return true;
					}

				}
				function nat_field()
				{
					//alert("noo");
					if (document.getElementById("sel1").selectedIndex== 0){
					//{alert("nationality here is false");
						//flag = false;
						//alert("jdjgjjd");
						document.getElementById("sp11").innerHTML = "u should choose ur nationality";
						flagnationality=false;
						return false;
					}
					else {
						alert("nationality here is true");
						//flag6 = true;
						flagnationality=true;
						document.getElementById("sp11").innerHTML = "";
						return true;
					}

				}
				function validatePwd() {
				var invalid = " "; // Invalid character is a space
				var minLength = 6; // Minimum length
				var pw1 = document.getElementById("txt7").value;
				//var pw2 = document.myForm.password2.value;
				// check for a value in both fields.
				if (pw1 == '') {//|| pw2 == ''
				document.getElementById("sp7").innerHTML ="Please enter your password";
				flagpassword=false;
				return false;
				}
				// check for minimum length
				if (pw1.length < minLength) {
				document.getElementById("sp7").innerHTML ="Your password must be at least 6 characters long. Try again";
				flagpassword=false;
				return false;
			}
			// check for spaces
			if (pw1.indexOf(invalid) > -1) {
			document.getElementById("sp7").innerHTML ="Sorry, spaces are not allowed";
			flagpassword=false;
				return false;
				}
					else {
						document.getElementById("sp7").innerHTML ="";
						flagpassword=true;
						return true;
   				}
			}
			function confirm1(){
				if(document.getElementById("txt8").value==document.getElementById("txt7").value){
					document.getElementById("sp8").innerHTML="";
					flagconfirm=true;
					return true;
				}
				else{
					document.getElementById("sp8").innerHTML="password does not match";
					flagconfirm=false;
					return false;
				}
			}
			function check(){
				if(flagname && flagemail && flagbirthday && flagcredit && flagpassword && flagconfirm && flagsex && flagnationality && flagadress && flaginterests && flagjob)
				return true;
				else
				return false;
			}
			function all(){
				g_field();
				//na_field();
				nat_field();
				//alert("flagname="+flagname);
				//alert("flagemail="+flagemail);
				//alert("flagbirthday="+flagbirthday);
				//alert("flagcredit="+flagcredit);
				//alert("flagpassword="+flagpassword);
				//alert("flagconfirm="+flagconfirm);
				//alert("flaginterests="+flaginterests);
				//alert("flagsex="+flagsex);
				//alert("flagnation="+flagnationality);

				return check();
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
                        <form name="lab3" action="index1.jsp" onsubmit="return all();">
		<table>
		<tr><td><b>Name</b></td><td><input type="text" size="20" id="txt1" onblur="name1()" name="name"><span id="sp1"></span></td></tr>
		<tr><td><b>Email</b></td><td><input type="text" size="20" id="txt2" onblur="email1()" name="email"><span id="sp2"></span></td></tr>
		<tr><td><b>Birthday</b></td><td><input type="text" size="20" id="txt3" onblur="isDate()" name="birthday"><span id="sp3">mm/dd/yyyy</span></td></tr>
		<tr><td><b>Adress</b></td><td><input type="text" size="20" id="txt4" name="adress" onblur="adress1()"><span id="sp4"></span></td></tr>
		<tr><td><b></>Credit Limit</b></td><td><input type="text" size="20" id="txt5" onblur="credit1()" name="credit"><span id="sp5"></span></td></tr>
                <tr><td><b>Job</b></td><td><input type="text" size="20" id="txt6" name="job" onblur="job1()"><span id="sp6"></span></td></tr>
                <tr><td><b>interests</b></td><td><input type="text" size="20" id="txt15" name="interests" onblur="interests1()"><span id="sp15"></span></td></tr>
		<tr><td><b>Password</b></td><td><input type="text" size="20" id="txt7" onblur="validatePwd()" name="password"><span id="sp7"></span></td></tr>
		<tr><td><b>Confirm Password</b></td><td><input type="text" size="20" id="txt8" onblur="confirm1()" name="confirm"><span id="sp8"></span></td></tr>
		<tr><td align="left" colspan="2"></><b></>Gender</b></td></tr>
		<tr><td><input type="radio" name="sex" value="male">male </td>
		<td><input type="radio" name="sex" value="female">female</td><tr>
		<tr><td colspan="2"><span id="sp9"></span></td></tr>
		<tr><td align="left" colspan="2"></><b></>Select your Interest</b></td></tr>
		<tr><td colspan="2" rowspan="2"></td></tr>
		<tr></tr>
		<tr><td align="left" colspan="2"></><b></>Nationality</b></td></tr>
		<tr><td colspan="2">
			<div>
			<select id="sel1" name="nationality">
				<option value="choose any option">choose any option</option>
				<option value="egypt">egypt</option>
				<option value="france">france</option>
				<option value="united states">united states</option>
			</select>
			</div>
				</td></tr>
		<tr><td colspan="2"><span id="sp11"></span></td></tr>
		<tr><td colspan="2" rowspan="4"></td></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr><td colspan="2"><span id="sp7"></span></td></tr>
		<tr><td><input type="submit" value="Sine Up" >
		</td><td><input type="reset" value="Reset"></td></tr>

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
