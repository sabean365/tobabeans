/*
Login Servlet to check username and password from login page
© August 28, 2017 Sarah Bean
 */
package toba.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/login.jsp";
        User user = (User) request.getSession().getAttribute("user");
        request.setAttribute("user", user);
        String message;
        
        if (user == null) {
            url = "/newCustomer.jsp"; 
            getServletContext().getRequestDispatcher(url)
                        .forward(request, response);
        }
        
        else {
        // get parameters from the request
        String username = (String) request.getAttribute("username");
        String password = (String) request.getAttribute("password");
        
            // validate the parameters
            if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
                message = "Please input your username and password.";
                url = "/login.jsp";
                getServletContext().getRequestDispatcher(url)
                        .forward(request, response);
                
            } 
            //compare the username and password for equality
            else if (username.equals(user.getUsername()) && password.equals(user.getPassword()))
            {    
                message = "";
                request.setAttribute("user", user);
                url = "/accountActivity.jsp";
                getServletContext().getRequestDispatcher(url)
                        .forward(request, response);
            }
            else   {
                message = "";
                url = "/loginFailure.jsp";
                getServletContext().getRequestDispatcher(url)
                        .forward(request, response);
            }

        //set message
        request.setAttribute("message", message);
        }
    }
}


