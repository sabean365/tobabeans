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
import javax.servlet.http.HttpSession;

public class PasswordResetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "/passwordReset.jsp";

        User user = (User) request.getSession().getAttribute("user");
        String message;
        String password = request.getParameter("password");
        String newPword = request.getParameter("newPword");
        String confirmPword = request.getParameter("confirmPword");

        // validate the parameters
        //if some of the parameters are null or empty, display message to fill out all boxes and reload NewCustomer.jsp
        if (newPword == null || confirmPword == null || newPword.isEmpty() || confirmPword.isEmpty()) {
            message = "Please fill out all forms.";
            url = "/passwordReset.jsp";

        } else if (newPword.equals(confirmPword)) {

            message = "";
            user.setPassword("newPword");
            url = "/accountActivity.jsp";

            //set password, user and message
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        //forward request and response objects to specified URL

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
