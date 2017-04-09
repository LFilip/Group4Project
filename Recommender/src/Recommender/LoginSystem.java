/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Louis Filip
 */
public class LoginSystem {
    
    
    public LoginSystem(){
        this.scanner = new Scanner(System.in);
        loggedIn = false;
        userDatabase = UserDatabase.getInstance();
        ioControl = IOControl.getInstance();
        loginGui = new LoginGuiController();
        loginWithGui();
    }
    
    /**
     *
     */
    public void loginMenu(){
        loginWithGui();


        while (!loginGui.isAuthenticated()){
            System.out.println("");
        }
        if (loginGui.isAuthenticated()){
            logIn();
            return;
        }
        
        
        
        System.out.println("Hello and welcome to the Recommender.");
        System.out.println("To Login type 1 and to create an accout type 2:");
        menuControlInt = ioControl.getIntInput();
        if (menuControlInt == 1){
            System.out.println("Please Enter Your User Name");
            userName = scanner.nextLine();
            user = userDatabase.find(userName);
            if (user != null){
            System.out.println("Hello, " + user.getName() + " please enter your password:");
            for (int i = 3; i > 0; i--){
                password = scanner.nextLine();
                if(user.getPassword().equals(password)){
                   logIn();
                   return;  // If the User remembers their password.
                }
                else {
                    System.out.println("That is incorrect.  You have " + i + " chances left"); // If they cant remember their password
                }
            }
            System.out.println("Well you will have to try again.");
            loginMenu();
            } else if (user == null){
                System.out.println("This is not a registered name"); // If there is no user by that name
            }
        }
        else if (menuControlInt == 2){
            userDatabase.createUser();
        }
    }
    
    
    private boolean loginWithGui(){
        loginGui.setVisible(true);
        
        return true;
    }
    
    public boolean isLoggedIn(){
        return loggedIn;
    }
    
    public void logOut(){
        loggedIn = false;
        System.out.println("You are now logged out!\n");
        loginGui.setVisible(true);
    }
    
    public void logIn(){
        loggedIn = true;
        System.out.println("You are now logged in!\n");
        loginGui.setVisible(false);
    }
    
/**
 *
 * @author Louis Filip
 * @return User - The current user held by the loginMenu
 * This function will return the current user or route the User to the login menu again.
 */
    public User getUser(){
        if (user != null){
        return user;
        }
        else 
        {
            System.out.println("Something has happened!, lets get you logged in!");
            loginMenu();
            return user;
        }
    }
    
    LoginGuiController loginGui;
    private final IOControl ioControl;
    private final UserDatabase userDatabase;
    private  final Scanner scanner;
    private int menuControlInt; 
    private User user;
    private String userName;
    private String password;
    private boolean loggedIn;
    
}
