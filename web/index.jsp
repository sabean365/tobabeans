<%-- 
    Document   : index
    Created on : Sep 09, 2017, 11:01:04 AM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<!DOCTYPE html>

<nav>
	<ul>
		<li><a href="index.jsp">HOME</a></li>
		<li><a href="login.jsp">LOGIN</a></li>
		<li><a href="accountActivity.jsp">ACCOUNT</a></li>
		<li><a href="transaction.jsp">TRANSACTION</a></li>
	</ul>

</nav>

<section class="main">
<h2>WELCOME TO TITAN ONLINE BANKING</h2>
	<aside>
		<div class="content">
			<h3>USER LOGIN</h3>
			<p>Click below to login<br>to your account.</p>
			<a class="btn" title="Login" href="login.jsp">LOGIN</a>
		</div>
	</aside>
	
		<div class="w3-content">
			<img class="mySlides"  
				src="images/onlineBank1.jpg"
				alt="Welcome">
			<img class="mySlides" 
				src="images/onlineBank2.jpg"
				alt="banking from laptop">
			<img class="mySlides" 
				src="images/onlineBank3.jpg"
				alt="banking from tablet">
			<img class="mySlides" 
				src="images/onlineBank4.jpg"
				alt="banking from smartphone">
		</div>
		
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}
    x[myIndex-1].style.display = "block";
    setTimeout(carousel, 4000); 
}
</script>

	<div id="hero">
	<h1>YOUR BANKING ANYTIME, ANYWHERE</h1>
	</div>		
</section>

<section class="bottom">
	<aside>
		<div class="address">
			<h4>Titan Bank<br>
			1234 Central Ave<br> 
			Saint Petersburg, FL 33701</h4>
			<span id="desktop">888-555-5555 </span><br>
			<a href="mailto:contact@TOBA.com">contact@TOBA.com</a><br>
		</div>
	</aside>
</section>

<%@ include file="/includes/footer.jsp" %>
