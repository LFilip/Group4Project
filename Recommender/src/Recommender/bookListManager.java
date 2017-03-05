/*
 * This class will manage all the things that need to be done to the Public Book List
 * TODO: Add functions to add book, edit a book and search for books.
 */
package Recommender;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.*;

/**
 *
 * @author Louis F
 */
public class bookListManager {
    
    private static bookListManager myBookList;
    
    /**
     * @author Louis Filip
     * 
     */
    private bookListManager(){
        this.ADD_BOOK_TEXT = "You have selected Add a Book\n"
                + "Please enter the Title of the new book";
        this.scanner = new Scanner(System.in);
        publicBookList = new ArrayList<>();
    }
   
     /**
     * @author Louis Filip
     * This is to get the instance of this singleton class
     * @return This will return the instance of myBookList so there is only one bookListManager
     */
    public static bookListManager getInstance(){
        if (myBookList == null){
            myBookList = new bookListManager();
            
        }
        return myBookList;
    }

    
    /**
     * @author Louis Filip
     * @return returns a list of all the public books
     */
    public ArrayList<Book> getBookList(){
        return publicBookList;
    }
    
    public boolean addBook(){
        System.out.println(ADD_BOOK_TEXT);
        String newTitle = scanner.nextLine();
        System.out.println("Now enter the Author");
        String newAuthor = scanner.nextLine();
        System.out.println("Excellent, now when was it published");
        int newPublishDate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Who published this book");
        String newPublisher = scanner.nextLine();
        Book newBook = new Book();
        newBook.setAuthor(newAuthor);
        newBook.setTitle(newTitle);
        newBook.setPublisher(newPublisher);
        
        publicBookList.add(newBook);
        saveList();
        
        return true;
    } 
    
    /**
     *
     */
    public void printList(){
        publicBookList.forEach((book) -> {
            System.out.println((publicBookList.indexOf(book) +1) + " :" +
            book.toString());
        });
    }
    
    public boolean removeBook(Book book){
        
        return true;
    
    }   
    
    /**
     *
     * @return
     */
    public boolean saveList(){
         try {
         FileOutputStream fileOut =
         new FileOutputStream("BookList.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(publicBookList);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in BookList.ser");
         printList();
      }catch(IOException i) {
         System.out.println("This didnt work");
         i.printStackTrace();
         
         return false;
      }
         return true;
    }
    
    /**
     *
     */
    public void loadList(){
        
       try {
         FileInputStream fileIn = new FileInputStream("BookList.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         publicBookList = (ArrayList<Book>) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
          System.out.println("There is no file yet!");
         i.printStackTrace();
      }catch(ClassNotFoundException c) {
         System.out.println("BookList not found You will need to make a new one"); 
         c.printStackTrace();
      }
    }
    
    /**
     * @author Louis Filip
     * @return
     */
    public boolean isEmpty(){
        return publicBookList.size() < 1;
    }
    
    ArrayList<Book> publicBookList;
    Scanner scanner;
    private final String ADD_BOOK_TEXT;
}
