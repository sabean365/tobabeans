/*
NewCustomerServlet to retrieve data from newCustomer.jsp
© August 28, 2017 Sarah Bean
 */
package toba.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/newCustomer.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/newCustomer.html";    // the "register" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            
            // store data in User object
            User user = new User(firstName, lastName, phone, address, city, state, zip, email);

            // validate the parameters
            String message;
            if (firstName == null || lastName == null || phone == null || city == null || 
                    state == null || zip == null || email == null || firstName.isEmpty() || 
                    lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() ||
                    state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
                message = "Please fill out all text boxes.";
                url = "/newCustomer.jsp";
            } 
            else {
                message = "";
                url = "/success.html";
                
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}