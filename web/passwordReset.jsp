<%-- 
    Document   : passwordReset
    Created on : Sep 13, 2017, 3:16:12 PM
    Author     : Sarah
--%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<%@ page import="toba.business.User" %>
<%
    
    User user = (User)request.getAttribute("user");
    if (user == null) {
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

    <h5>RESET PASSWORD</h5>
    <p>Change your password in the form below:</P>


    <p><i>${message}</i></p>
    <form method="post" action="PasswordReset">
        <input type="hidden" name="action" value="add">     
        <label>New:</label>
        <input type="text" name="newPword" value="${param.newPword}"><br>
        <label>Confirm:</label>
        <input type="text" name="confirmPword" value="${param.confirmPword}"><br>
        <button type="submit" value="update">UPDATE</button>
    </form>  


</section>


<%@ include file="/includes/footer.jsp" %>