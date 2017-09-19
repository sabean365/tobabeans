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
        
        // get current action
        String action = request.getParameter("action");
        
        
        //default
        if (action == null){
            action = "join";
        }
        
        if (action.equals("join"))
            url = "/login.jsp";
        
        // perform action and set URL to appropriate page
        if (action.equals("add")) {
            // get parameters from the request
            String username = (String)request.getParameter("username");
            String password = (String)request.getParameter("password");
            
            // validate the parameters
            User user = new User(username, password);
            
            
            String message = null;
            
            
            
            if (username == null || password == null || username.isEmpty() || password.isEmpty())   
            {
                message = "Please input your username and password.";
                url = "/login.jsp";
            } 
                        
            else if (username.equals(username) && password.equals(password)) {
                
                message = "";
                request.setAttribute("user", user);
                url = "/accountActivity.jsp";
            }
            
            else
            {
                
                message = "";
                url = "/loginFailure.jsp";
            }
           
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}