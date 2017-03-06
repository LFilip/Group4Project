/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;
import java.util.Scanner;

/**
 * @author Louis Filip
 */
public class mainController {

    private final UserDatabase UserListManager;
    
    /**
     * @author Louis Filip
     * Constructor will get the User logged in and then instantiate the booklist manager
     */
    public mainController() {
        login = new loginSystem(); 
        UserListManager = UserDatabase.getInstance();
        BookListManager = BookDatabase.getInstance();
 

    }
    
/**
 * @author Louis Filip
 *   run() will begin the login screen process then keep the loop going while we stay logged in.
 */
    public void run(){
        // this is the loop that will keep the User Logged in or at the login screen.
        login.loginMenu();
        while (login.isLoggedIn()){
           user = login.getUser();
        // this loop will keep the User coming back to the main menu until they Log Out.
        while (userMenuMain()){
            
        }
        }
        
        // The user has logged out or has been logged out by an incorrect event

        run();
        
        
    }
    
    
/**
 * @author Louis Filip
 * @return will return true if it is still logged in and will return false if they choose to log out
 *    This method lets the user choose which of the main activities they wish to do.
 */
    public boolean userMenuMain(){
        System.out.print(INITIAL_PROMPT);
        menuControlInt = getIntInput();
        switch (menuControlInt){
            case 1: enterMainList(); break; 
            case 2: enterWishList(); break;
            case 3: enterRecommendations(); break;
            case 4: userProfileChange(); break;
            case 5: login.logOut();return false;
            case 6: System.exit(0);
        }
        
        return true;
    }
    
/**
 * @author Louis Filip
 *   This method will let the user interact with their main list
 * @return will return true if it ran successfully
 */    
    public boolean enterMainList(){
        while (menuControlInt != 4){
            if (BookListManager.isEmpty()){
                System.out.println("There is nothing here, Please add some books");
            }
            else{
            System.out.println("Here is Your List");
            System.out.println("---------------------------------");
            user.printList();
            }
        System.out.println(USER_MAIN_LIST_TEXT);
         menuControlInt = getIntInput();
                switch (menuControlInt){
            case 1: user.addBook(BookListManager.addBook()); UserListManager.saveUsers(); break; // the function addBook also returns the book it created.
            case 2: System.out.println("Select the book to remove:");
                user.printList();int temp = getIntInput(); user.removeBook(temp);
                UserListManager.saveUsers();break;   
            case 3: BookListManager.printList();
                    UserListManager.saveUsers(); break;
            case 4: return true;
        }
        }
        return true;
    }
 
 /**
 * @author Louis Filip
 *   This method will let the user interact with their Wish list
 * @return will return true if it ran successfully
 */
    public boolean enterWishList(){
        System.out.println(USER_WISH_LIST_TEXT);
        menuControlInt = scanner.nextInt();
        scanner.nextLine();
        return true;
    }
    
/**
 * @author Louis Filip
 *   This method will let the user interact with their recommendation list
 * @return will return true if it ran successfully
 */
    public boolean enterRecommendations(){
        System.out.println(USER_RECOMMENDATION_TEXT);
        BookListManager.printList();
        menuControlInt = getIntInput();
        scanner.nextLine();
        return true;
    }
    
 /**
 * @author Louis Filip
 *   This method will let the user change the profile
 * @return will return true if it ran successfully
 */
    public boolean userProfileChange(){
        System.out.println("Feature Coming Soon, Type a Number to return");
        menuControlInt = getIntInput();
        scanner.nextLine();
        return true;
    }
    
    // Helper function to get an int input instead of anything else (FOR MENU INPUTS)
   private int getIntInput(){
   int number;
    do {
    System.out.println("Please enter your choice number:");
    while (!scanner.hasNextInt()) {
        System.out.println("That's not a number!");
        scanner.next(); // this is important!
    }
    number = scanner.nextInt();
    } while (number <= 0);
    return number;
    }
   
   
    private final BookDatabase BookListManager;
    private final loginSystem login;
    private final Scanner scanner = new Scanner(System.in);
    private int menuControlInt;
    private User user;    
    private final String INITIAL_PROMPT = 
            "Hello and Thanks for Choosing Recommender\n"
            + "Please Press 1 to Go To Your List\n"
            + "Please Press 2 to Go To Your Wishlist\n"
            + "Please Press 3 to Go To The Public List\n"
            + "Please Press 4 to Edit Your Profile\n"
            + "Please Press 5 to Log Out\n"
            + "Please Press 6 to Exit Program\n";

    private static final String USER_MAIN_LIST_TEXT = 
          "Welcome to your Main List!\n"
          + "Please Press 1 to Add a Book to Your List\n"
          + "Please Press 2 to Remove a Book from Your List\n"
          + "Please Press 3 to View Public List\n"
           + "Please Press 4 to Return to the Main Menu";
    
    private static final String USER_WISH_LIST_TEXT = 
          "Welcome to Your Wish List!\n"
          + "Please Press 1 to Add a Book to Your Wish List\n"
          + "Please Press 2 to Remove a Book from Your Wish List\n"
          + "Please Press 3 to Return to the Main Menu\n";
    
    private static final String USER_RECOMMENDATION_TEXT = 
          "Welcome to The Public List!\n"
          + "From here we will find you a new book to read."
           + "\nJust Enter The Number of the Book You Wish To Investigate.";
        

}

