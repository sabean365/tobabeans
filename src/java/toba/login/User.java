/**
 *User class to add member variables
 *@2017 author Sarah Bean
 */
package toba.login;

import java.io.Serializable;


//Private variables for registration as new user
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String username;
    private String password;

    //Zero Argument Constructor
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        email = "";
        username = "";
        password = "";
        
        
    }

    //Constructor
    public User(String firstName, String lastName, String phone, String address, String city, 
            String state, String zip, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.username = username;
        this.password = password;
    }
  
    public User(String username, String password) {
        this.username = username;
        this.password = password;
   
    }

    //Get and set methods for all variables to be inputed
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
      public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
      public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
      public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getUsername() {
        return username;
    
    }
     public void setUsername(String username){
        this.username = username;
    }
    
    
    public String getPassword() {
        return password;
    
    }
     public void setPassword(String password){
        this.password = password;
    }
    
}

