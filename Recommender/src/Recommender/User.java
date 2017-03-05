/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

/**
 *
 * @author Louis Filip
 * 
 */
public class User {

    /**
     *
     * @param newName
     * @param newPassword
     */
    public User(String newName, String newPassword) {
        name = newName;
        password = newPassword;
    }
    
    /**
     * @author Louis F
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     * @author Louis F
     * @return
     */
    public String getPassword(){
        return password;
    }
    
    
    public String name;
    public String password;
}
