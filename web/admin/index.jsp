<%-- 
    Document   : accountActivity
    Created on : Oct 05, 2017, 2:59:47 PM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<h1>Welcome to the Admin Application</h1>

<form action="reports.htm" method="post">
    <input type="submit" value="Reports">
</form>

<%@ include file="/includes/footer.jsp" %>
