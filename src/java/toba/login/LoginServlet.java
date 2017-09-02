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
        String url = "/login.html";
        
        // get current action
        String action = request.getParameter("action");
        
        
        //default
        if (action == null){
            action = "join";
        }
        
        if (action.equals("join"))
            url = "/login.html";
        
        // perform action and set URL to appropriate page
        if (action.equals("add")) {
            // get parameters from the request
            String username = (String)request.getParameter("username");
            String password = (String)request.getParameter("password");
            
            
            // validate the parameters
            
            String message = null;
            
            if (username == null || password == null || username.isEmpty() || password.isEmpty())   
            {
                message = "Please input your username and password.";
                url = "/login.html";
            } 
                        
            else if ("jsmith@toba.com".equals(username) && "letmein".equals(password)) {
                
                message = "";
                url = "/accountActivity.html";
            }
            
            else
            {
                
                message = "";
                url = "/loginFailure.html";
            }
           
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}

