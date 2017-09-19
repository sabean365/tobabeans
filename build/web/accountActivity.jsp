<%-- 
    Document   : accountActivity
    Created on : Sep 09, 2017, 2:59:47 PM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<%@ page import="toba.login.User" %>
<%

    User user = (User) request.getAttribute("user");
    if (user == null) {
        user = new User();
    }
%>
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
    <h5>ACCOUNT ACTIVITY</h5>

    <c:if test="${sessionScope.user != null}">
        <p>Welcome ${user.firstName}<br>${user.lastName}</p>
        </c:if>
    <c:if test="${sessionScope.user == null}">
        <p>Not logged in.</p>
    </c:if>

</section>     



<%@ include file="/includes/footer.jsp" %>
