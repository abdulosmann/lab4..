package ca.servlets.models;

import java.io.Serializable;

/**
 *
 * @author aboud
 */
public class User implements Serializable {
    private String username;
    
    private String password;
    
    public User() {
        
    }
     public User(String username, String password) {
         this.username = username;
         this.password = password;
     }
     
     public String getUsername() {
         return username;
     }
     
     public void setUsername (String username) {
         this.username = username;
     }
     
     public String toString() {
         return this.username;
     }
}
