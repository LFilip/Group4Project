/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;
import java.util.ArrayList;
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
        menuControlInt = getIntInput(6);
        switch (menuControlInt){
            case 1: enterMainList(); break; 
            case 2: enterWishList(); break;
            case 3: enterPublicList(); break;
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
            clearScreen();
            if (user.getBookListSize() == 0){
                System.out.println("There is nothing here, Please add some books");
            }
            else{
            System.out.println("Here is Your List");
            System.out.println("---------------------------------");
            user.printList();
            System.out.println();
            
            }
        System.out.println(USER_MAIN_LIST_TEXT);
         menuControlInt = getIntInput(4);
                switch (menuControlInt){
            case 1: user.addBook(BookListManager.addBook()); UserListManager.saveUsers(); break; // the function addBook also returns the book it created.
            case 2: System.out.println("Select the book to remove:");
                    user.printList();int temp = getIntInput(user.getBookListSize()); user.removeBook(temp);
                    UserListManager.saveUsers();break;   
            case 3: System.out.println("Which book do you want more information for?");
                    int bookIndex = getIntInput(user.getBookListSize());
                    user.searchListByIndex(bookIndex).printDetails();
                    System.out.println("To continue type anything and press Enter");
                    scanner.next();
                     break;
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
        while (menuControlInt != 4){
            clearScreen();
            if (user.getWishListSize() == 0){
                System.out.println("There is nothing here, Please add some books");
            }
            else if (user.getWishListSize() > 0){
            System.out.println("Here is Your List");
            System.out.println("---------------------------------");
            user.printWishList();
            System.out.println();
            
            
        System.out.println(USER_WISH_LIST_TEXT);
         menuControlInt = getIntInput(4);
                switch (menuControlInt){
            case 1: user.addBook(BookListManager.addBook()); UserListManager.saveUsers(); break; // the function addBook also returns the book it created.
            case 2: System.out.println("Select the book to remove:");
                user.printList();int temp = getIntInput(user.getWishListSize()); user.removeBook(temp);
                UserListManager.saveUsers();break;   
            case 3: BookListManager.printList();
                    UserListManager.saveUsers(); break;
            case 4: return true;
        }
        }
        return true;
        }
        return false;
    }
    
/**
*  TODO:  This whole thing
     * @param searchCatagory
* @return
*/
    public boolean enterRecommendationList(int searchCatagory){
        
        return false;
        
    }{
    
    }
    
    
    public void viewSimilarBooks(String genre){
        ArrayList<Book> similarList;
        similarList = new ArrayList<>() ;
        for (int i = 1; i < BookListManager.getBookList().size();i++){
            if (BookListManager.getBookAtIndex(i).getGenre().equals(genre)){
                similarList.add(BookListManager.getBookAtIndex(i));
            }
        }
        
       
        if (similarList.size() == 0){
            System.out.println("There are no books similar to this book.  If you know one enter it in your list!");
            
        } else {
            for (Book book: similarList){
                book.printDetails();
            }
        }
    }
/**
 * @author Louis Filip
 *   This method will let the user interact with their recommendation list
 * @return will return true if it ran successfully
 */
    public boolean enterPublicList(){
        clearScreen();
        System.out.println(USER_PUBLIC_LIST_TEXT);
        if (BookListManager.getBookList().size() > 0){
        BookListManager.printList();
        int bookIndex = getIntInput(BookListManager.getBookList().size());
        Book bookAtIndex = BookListManager.getBookAtIndex(bookIndex); // accounts for the 1 off in the actual function
        bookAtIndex.printDetails();
        System.out.println(USER_PUBLIC_LIST_TEXT_TWO);
        menuControlInt = getIntInput(5);
        switch(menuControlInt){
            case 1: user.addBook(bookAtIndex); UserListManager.saveUsers(); break;
            case 2: user.addBookWishList(bookAtIndex); UserListManager.saveUsers(); break;
            case 3: bookAtIndex.printReviews(); break;
            case 4: enterPublicList(); break;
            case 5: clearScreen(); viewSimilarBooks(bookAtIndex.getGenre());
            case 6: return true;
        }
        
        return true;
        }
        else {
            System.out.println("There are no books in the list yet!");
            System.out.println("Returning to main menu.");
            return false;
        }
    }
    
 /**
 * @author Louis Filip
 *   This method will let the user change the profile
 * @return will return true if it ran successfully
 */
    public boolean userProfileChange(){
        System.out.println("Feature Coming Soon, Type a Number to return");
        menuControlInt = getIntInput(1);
        scanner.nextLine();
        return true;
    }
    
    // Helper function to get an int input instead of anything else (FOR MENU INPUTS)
   private int getIntInput(int maxNumber){
   int number;
    do {
    System.out.println("Please enter your choice number:");
    while (!scanner.hasNextInt()) {
        System.out.println("That's not an option");
        scanner.next(); // this is important!
    }
    number = scanner.nextInt();
    } while (number <= 0 || number > maxNumber);
    return number;
    }
   
   // Helper function to clear the screen to make a more pleasing look
    private void clearScreen(){
       for (int i = 0; i < 25; i ++){
           System.out.println("\n");
       }
   }
    
    
    private final BookDatabase BookListManager;
    private Book book; 
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
          + "Please Press 3 to View Book Details\n"
           + "Please Press 4 to Return to the Main Menu";
    
    private static final String USER_WISH_LIST_TEXT = 
          "Welcome to Your Wish List!\n"
          + "Please Press 1 to Add a Book to Your Wish List\n"
          + "Please Press 2 to Remove a Book from Your Wish List\n"
          + "Please Press 3 to Return to the Main Menu\n";
    
    private static final String USER_PUBLIC_LIST_TEXT = 
          "Welcome to The Public List!\n"
          + "From here we will find you a new book to read."
           + "\nJust Enter The Number of the Book You Wish To Investigate.";
    
    private static final String USER_PUBLIC_LIST_TEXT_TWO = 
            "Please Press 1 to add this book to your List\n"
            + "Please Press 2 to add this book to your Wishlist\n"
            + "Please press 3 to see the reviews of this book\n"
            + "Please Press 4 to choose another book in the public list\n"
            + "Please Press 5 to view similar books\n"
            + "Please Press 5 to return to main menu";

}

