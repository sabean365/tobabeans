<%-- 
    Document   : newCustomer
    Created on : Aug 27, 2017, 10:34:27 PM
    Author     : Sarah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta name="description" content="TITAN Online Banking">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" media="all" href="stylesheet/toba.css">
        <title>TITAN Online Banking: Register</title>
    </head>
    <body>
        <div id="page">
            <header>
                <a class="logo" title="Titan Online Banking" href="#"></a>
            </header>
            <nav>
                <ul>
                    <li><a href="index.html">HOME</a></li>
                    <li><a href="login.html">LOGIN</a></li>
                    <li><a href="accountActivity.html">ACCOUNT</a></li>
                    <li><a href="transaction.html">TRANSACTION</a></li>
                </ul>

            </nav>

            <section class="main">
                <h5>REGISTER</h5>
                <p>Enter your information below:</p>
                
                <p><i>${message}</i></p>
                <form action="NewCustomer" method="post">
                    <input type="hidden" name="action" value="add">
                    <label>First Name:</label>
                    <input type="text" name="firstName" value="${user.firstName}"><br>
                    <label>Last Name:</label>
                    <input type="text" name="lastName" value="${user.lastName}"><br>
                    <label>Phone:</label>
                    <input type="text" name="phone" value="${user.phone}"><br>
                    <label>Address:</label>
                    <input type="text" name="address" value="${user.address}"><br>
                    <label>City:</label>
                    <input type="text" name="city" value="${user.city}"><br>
                    <label>State:</label>
                    <input type="text" name="state" value="${user.state}"><br>
                    <label>Zip:</label>
                    <input type="text" name="zip" value=${user.zip}><br>
                    <label>Email:</label>
                    <input type="email" name="email" value="${user.email}"><br>

                    <button type="submit" value="register">REGISTER</button>
                </form>




            </section>
            <footer>
                &copy; 2017 TITAN Online Banking
                <a title="Privacy Policy" href="#">Privacy Policy</a>
                <a title="Terms of Service" href="#">Terms of Service</a>
            </footer>
        </div>
    </body>
</html>


