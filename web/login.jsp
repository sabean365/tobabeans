<%-- 
    Document   : login
    Created on : Sep 09, 2017, 11:03:18 AM
    Author     : Sarah
--%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<nav>
	<ul>
		<li><a href="index.jsp">HOME</a></li>
		<li><a href="login.jsp">LOGIN</a></li>
		<li><a href="accountActivity.jsp">ACCOUNT</a></li>
		<li><a href="transaction.jsp">TRANSACTION</a></li>
	</ul>

</nav>

    <section class="main">
        <br>
	<h5>LOGIN</h5>
        <p>To login to your online banking, please provide your username and password below:</p><br>
         
        
        <p><i>${message}</i></p>
        <form action="Login" method="post">
            <input type="hidden" name="action" value="add">
		<label>Username:</label>
		<input type="text" name="username"><br>
		<label>Password:</label>
		<input type="text" name="password" ><br>
		<button type="submit" value="login">LOGIN</button>
	</form>
        
        <h5>RESET PASSWORD</h5>
        <p>Want to change your password? Reset it here.</p>
        <form method="post" action="passwordReset.jsp">
            <button type="submit" value="reset">RESET</button>
        </form>
	
	<h5>REGISTER</h5>
	<p>Would you like to use TITAN ONLINE BANKING? Click below to register.</p>
	<form action="newCustomer.jsp" method="post">
            <button type="submit" value="Register">REGISTER</button>
            
        </form>
    </section>

	
<%@ include file="/includes/footer.jsp" %>
