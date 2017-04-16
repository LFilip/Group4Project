/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Group 4
 */
public class UserDatabase  {

    private final IOControl ioControl;
    
    
    public void setLoggedInUser(User newUser){
        user = newUser;
    }
    
    public User getLoggedInUser(){
        return user;
    }
    
    private UserDatabase(){
        this.scanner = new Scanner(System.in);
        ioControl = IOControl.getInstance();
               File f = new File("UserList.ser");
       if (f.isFile()){
        userList= ioControl.readUserFile();
       } else{
           userList = new ArrayList<>();
       }
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty(){
        if(userList.size() < 1){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     *
     * @param searchString
     * @return
     */
    public User find(String searchString){
        if (userList.size() < 1){
            System.out.println("There are no created users.  Please create an accout");
            createUser();
        }

        User tempUser = null;
            for (User testUser : userList){
                if (testUser.getName().equals(searchString)){
                    tempUser = testUser;
                }
                     
            }
        return tempUser;

        
    }
            
    public boolean saveUsers(){
        ioControl.writeUserFile(userList);
        
        return true;
    }        
            
    public static UserDatabase getInstance(){
        if (userDatabase == null){
            userDatabase = new UserDatabase();
            
        }
        return userDatabase;
    }
    
    public void createUser(String newUserName, String newUserPassword){
        user = new User(newUserName, newUserPassword, userList.size() + 1);
        userList.add(user);
        ioControl.writeUserFile(userList);
    }
    
    
    
    public void createUser(){
            System.out.println("Now we will create account.  Enter the name you want");
            userName = scanner.nextLine();
            System.out.println("Well done," + userName + "!");
            System.out.println("Next enter your Password");
            password = scanner.nextLine();
            System.out.println("Excellent, now type that in again to confirm");
            String tempPass = scanner.nextLine();
            if (tempPass.equals(password)){
                user = new User(userName, password, userList.size() + 1);
                userList.add(user);
                ioControl.writeUserFile(userList);
            }
            else {
                System.out.println("You entered The wrong one.  Try Setup Again");
                createUser();
            }

    }
        
    void addMedia(Media selectedMedia) {
        user.addMedia(selectedMedia);
    }
    
    private String userName;
    private String password;
    private  final Scanner scanner;
    private static UserDatabase userDatabase;
    private User user;
    private ArrayList<User> userList;


}
