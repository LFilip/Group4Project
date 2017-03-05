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
public class loginSystem {
    
    public loginSystem(){
        this.scanner = new Scanner(System.in);
        loggedIn = false;
        this.userList = new ArrayList<>();
    }
    
    
    public void loginMenu(){
        System.out.println("Hello and welcome to the Recommender.");
        System.out.println("To Login type 1 and to create an accout type 2:");
        menuControlInt = scanner.nextInt();
        scanner.nextLine();
        if (menuControlInt == 1){
            user = new User("Louis", "Password");
            loggedIn = true;
        }
        else if (menuControlInt == 2){
            createUser();
        }
    }
    
    public boolean isLoggedIn(){
        return loggedIn;
    }
    
    public void logOut(){
        loggedIn = false;
        System.out.println("You are now logged out!\n");
    }
    
    public void logIn(){
        loggedIn = true;
        System.out.println("You are now logged in!\n");
    }
  
    private void createUser(){
            System.out.println("Now we will create account.  Enter the name you want");
            userName = scanner.nextLine();
            System.out.println("Well done," + userName + "!");
            System.out.println("Next enter your Password");
            password = scanner.nextLine();
            System.out.println("Excellent, now type that in again to confirm");
            String tempPass = scanner.nextLine();
            if (tempPass.equals(password)){
                user = new User(userName, password);
                logIn();
                
            }
            else {
                System.out.println("You entered The wrong one.  Try Setup Again");
                createUser();
            }

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
    
    private ArrayList<User> userList;
    private  final Scanner scanner;
    private int menuControlInt; 
    private User user;
    private String userName;
    private String password;
    private boolean loggedIn;
    
}
