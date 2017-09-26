<%-- 
    Document   : success
    Created on : Sep 10, 2017, 11:34:16 AM
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
	<h5>SUCCESS!</h5>
	<p>You have created an account with TITAN ONLINE BANKING.</p>
        <p>Here is your information:</p>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Phone:</label>
        <span>${user.phone}</span><br>
        <label>Address:</label>
        <span>${user.address}</span><br>
        <label>City:</label>
        <span>${user.city}</span><br>
        <label>State:</label>
        <span>${user.state}</span><br>
        <label>Zip:</label>
        <span>${user.zip}</span><br><br>
        
        <p>Your username is <span>${user.username}</span></p>
        <p>Your temporary password is "welcome1"</p>
        
</section> 
        
<%@ include file="/includes/footer.jsp" %>