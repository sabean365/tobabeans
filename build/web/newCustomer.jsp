<%-- 
    Document   : newCustomer
    Created on : Aug 27, 2017, 10:34:27 PM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<!DOCTYPE html>
<html lang="en">

    <nav>
        <ul>
            <li><a href="index.jsp">HOME</a></li>
            <li><a href="login.jsp">LOGIN</a></li>
            <li><a href="accountActivity.jsp">ACCOUNT</a></li>
            <li><a href="transaction.jsp">TRANSACTION</a></li>
        </ul>

    </nav>

    <section class="main">
        <h5>REGISTER for TITAN ONLINE BANKING</h5>
        <p>Please enter your information below:</p>

        <p><i>${message}</i></p>
        <div class="form">  
            <form action="NewCustomer" method="post">
                <input type="hidden" name="action" value="add">
                <label>First Name:</label>
                <input type="text" name="firstName" value="${param.firstName}"><br>
                <label>Last Name:</label>
                <input type="text" name="lastName" value="${param.lastName}"><br>
                <label>Phone:</label>
                <input type="text" name="phone" value="${param.phone}"><br>
                <label>Address:</label>
                <input type="text" name="address" value="${param.address}"><br>
                <label>City:</label>
                <input type="text" name="city" value="${param.city}"><br>
                <label>State:</label>
                <input type="text" name="state" value="${param.state}"><br>
                <label>Zip:</label>
                <input type="text" name="zip" value="${param.zip}"><br>
                <label>Email:</label>
                <input type="email" name="email" value="${param.email}"><br>

                <button type="submit" value="register">REGISTER</button>
            </form>

            <br>

            <c:if test="!${param.user} == null && ${param.user}.isEmpty())" >
                <jsp:forward page="/success.jsp" /> </c:if>

            <%@ include file="/includes/footer.jsp" %>
