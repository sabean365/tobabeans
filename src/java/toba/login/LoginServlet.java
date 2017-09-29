/*
Login Servlet to check username and password from login page
© August 28, 2017 Sarah Bean
 */
package toba.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import toba.business.User;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        
        User user = (User) request.getSession().getAttribute("user");
        String message;

        String url = "/login.jsp";

        // get parameters from the request
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");

        // validate the parameters
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            message = "Please input your username and password.";
            url = "/login.jsp";
            getServletContext().getRequestDispatcher(url)
                    .forward(request, response);

        } //compare the username and password for equality
        else if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            message = "";
            url = "/accountActivity.jsp";
            getServletContext().getRequestDispatcher(url)
                    .forward(request, response);
        } else {
            message = "";
            url = "/loginFailure.jsp";
            getServletContext().getRequestDispatcher(url)
                    .forward(request, response);
        }

        //set message
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        request.setAttribute("message", message);
    }
}

