/*
NewCustomerServlet to retrieve data from newCustomer.jsp
© August 28, 2017 Sarah Bean
 */
package toba.login;

import toba.business.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.data.UserDB;

public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/newCustomer.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/newCustomer.jsp";    // the "register" page
        } else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
           
            //Declare user object
            User user = null;
            
            // validate the parameters
            String message;
            //if some of the parameters are null or empty, display message to fill out all boxes and reload NewCustomer.jsp
            if (firstName == null || lastName == null || phone == null || city == null
                    || state == null || zip == null || email == null || firstName.isEmpty()
                    || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty()
                    || state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
                
                //prompt user to fill in all the fields
                message = "Please fill out all text boxes.";
                
                //redirect to the same page for completion
                url = "/newCustomer.jsp";
                
            } //If registration form has been filled out correctly, then go to success.html
            else {
                // store data in User object
                try{
                user = new User(firstName, lastName, phone, address, city, state, zip, email);
                UserDB.insert(user);
                } catch (Exception ex){
                    System.out.print(ex.getMessage());
                }
                message = "";
                url = "/success.jsp";
                

            }
            
            //set User object in request; set message in request
            HttpSession actualSession = request.getSession();
            actualSession.setAttribute("user", user);
            actualSession.setAttribute("message", message);
        }
        //forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

}
