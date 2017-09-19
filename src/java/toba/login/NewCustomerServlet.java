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
    protected void doPost(HttpServletRequest session,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/newCustomer.jsp";

        // get current action
        String action = session.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/newCustomer.jsp";    // the "register" page
        } else if (action.equals("add")) {
            // get parameters from the request
            String firstName = session.getParameter("firstName");
            String lastName = session.getParameter("lastName");
            String phone = session.getParameter("phone");
            String address = session.getParameter("address");
            String city = session.getParameter("city");
            String state = session.getParameter("state");
            String zip = session.getParameter("zip");
            String email = session.getParameter("email");
            String username = session.getParameter("username");
            String password = session.getParameter("password");

            // store data in User object
            User user = new User(firstName, lastName, phone, address, city, state, zip, email, username, password);

            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setPhone(phone);
            user.setAddress(address);
            user.setCity(city);
            user.setState(state);
            user.setZip(zip);
            user.setEmail(email);
            user.setUsername(lastName + zip);
            user.setPassword("welcome1");

            // validate the parameters
            String message;
            //if some of the parameters are null or empty, display message to fill out all boxes and reload NewCustomer.jsp
            if (firstName == null || lastName == null || phone == null || city == null
                    || state == null || zip == null || email == null || firstName.isEmpty()
                    || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty()
                    || state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
                message = "Please fill out all text boxes.";
                url = "/newCustomer.jsp";
            } //If registration form has been filled out correctly, then go to success.html
            else {
                message = "";
                url = "/success.jsp";

            }
            
            //set User object in request; set message in request
            session.setAttribute("user", user);
            session.setAttribute("message", message);
        }
        //forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(session, response);
    }

}
