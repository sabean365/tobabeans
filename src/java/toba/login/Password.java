/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.login;

import java.io.Serializable;

public class Password implements Serializable {
    
    private String password;
    private String newPword;
    private String confirmPword;
    


    public Password() {
        password = "";
        newPword = "";
        confirmPword = "";
        
    }
    
    //constructor
    public Password(String password, String newPword, String confirmPword){
        this.password = password;
        this.newPword = newPword;
        this.confirmPword = confirmPword;
        
    }
    
     //Get and set methods for all variables to be inputed
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
    public String getNewPword() {
        return newPword;
    }

    public void setNewPword(String newPword) {
        this.newPword = newPword;
    }
    
    public String getConfirmPword() {
        return confirmPword;
    }

    public void setConfirmPword (String confirmPword) {
        this.confirmPword = confirmPword;
    }
}
