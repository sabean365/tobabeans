/*
PasswordResetServlet to retrieve data from PasswordReset.jsp
© August 28, 2017 Sarah Bean
 */
package toba.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PasswordResetServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
        
            
        
        
        String url = "/passwordReset.jsp";
        
        
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/passwordReset.jsp";    // the "register" page
        } 
        
        else if (action.equals("add")) {
            // get parameters from the request
            
            
            
            String password = request.getParameter("password");
            String newPword = request.getParameter("newPword");
            String confirmPword = request.getParameter("confirmPword");
            
            Password p = new Password(password, newPword, confirmPword);
            
   
            
            p.setPassword(password);
            p.setNewPword(newPword);
            p.setConfirmPword(confirmPword);
            
            // validate the parameters
            String message;
            //if some of the parameters are null or empty, display message to fill out all boxes and reload NewCustomer.jsp
            if (newPword.isEmpty() || confirmPword.isEmpty()) {
                message = "Please fill out all forms.";
                url = "/passwordReset.jsp";
            } 
            else if (newPword.equals(confirmPword)) {
                    
                message = "";
                url = "/accountActivity.jsp";
            }
            
            else  {
                message="Passwords don't match. Please try again.";
                url = "/passwordReset.jsp";
            }
        
            
            //set User object in session; set message in sesssion
            request.setAttribute("password", confirmPword);
            request.setAttribute("message", message);
        }
        //forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

   
}