<%-- 
    Document   : loginFailure
    Created on : Sep 09, 2017, 3:11:09 PM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<!DOCTYPE html>
<html lang="en">

<%@ page import="toba.business.User" %>
<%
    User user = (User) request.getAttribute("user");
    if(user == null) {
        user = new User();
        }
 %>
 
 <nav>
	<ul>
		<li><a href="index.jsp">HOME</a></li>
		<li><a href="login.jsp">LOGIN</a></li>
		<li><a href="accountActivity.jsp">ACCOUNT</a></li>
		<li><a href="transaction.jsp">TRANSACTION</a></li>
	</ul>

</nav>
 
 <section class="main">
	<h5>LOGIN COULD NOT BE COMPLETED.</h5>
        <p>We did not find a matching username or password.</p>
        <p>To login to your online banking, please try your username and password again.</p>


</section>

<%@ include file="/includes/footer.jsp" %>