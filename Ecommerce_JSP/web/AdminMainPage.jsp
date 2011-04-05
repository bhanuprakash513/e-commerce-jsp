<%-- 
    Document   : AdminMainPage
    Created on : Mar 30, 2011, 9:12:17 PM
    Author     : islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="LoadHeader" />
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
				<h2 class="title">Admin control panel</h2>
				<div class="entry">
				<br>
				<br>
				<a href="AddProductPage.jsp"><font size="5"><b>Add Product</b></font></a>
				<br>
				<br>
				<a href="CategoryAdding.jsp"><font size="5"><b>Add Category</b></font></a>
				<br>
				<br>
				<a href="ViewAllProducts.jsp"><font size="5"><b>View All products</b></font></a>
				<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
	<!-- end #page -->
