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
public class BookDatabase {
    
    private static BookDatabase myBookList;
    
    /**
     * @author Louis Filip
     * 
     */
    private BookDatabase(){
        this.ADD_BOOK_TEXT = "You have selected Add a Book\n"
                + "Please enter the Title of the new book";
        this.scanner = new Scanner(System.in);
        ioControl = IOControl.getInstance();
        File f = new File("BookList.ser");
       if (f.isFile()){
        publicBookList = ioControl.readBookFile();
       }
       else {
           publicBookList = new ArrayList<>();
       }
    }
   
     /**
     * @author Louis Filip
     * This is to get the instance of this singleton class
     * @return This will return the instance of myBookList so there is only one BookDatabase
     */
    public static BookDatabase getInstance(){
        if (myBookList == null){
            myBookList = new BookDatabase();
            
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
    
    public Book addBook(){
        System.out.println(ADD_BOOK_TEXT);
        String newTitle = scanner.nextLine();
        System.out.println("Now enter the Author");
        String newAuthor = scanner.nextLine();
        System.out.println("Excellent, now when was it published");
        int newPublishDate = ioControl.getIntInput();
        System.out.println("Who published this book");
        String newPublisher = scanner.nextLine();
        Book newBook = new Book();
        newBook.setAuthor(newAuthor);
        newBook.setTitle(newTitle);
        newBook.setPublisher(newPublisher);
        
        publicBookList.add(newBook);
        saveList();
        
        return newBook;
    } 
    
    /**
     *@author Louis Filip
     */
    public void printList(){
        for (Book book : publicBookList){
            System.out.println((publicBookList.indexOf(book) +1) + " :" +
            book.toString());
        }
    }
    
    public boolean editBook(Book book){
        publicBookList.remove(book);
        return true;
    
    }   
    
    /**
     *
     * @return
     */
    public boolean saveList(){
        ioControl.writeBookFile(publicBookList);
         return true;
    }
    
    
    
    /**
     * @author Louis Filip
     * @return
     */
    public boolean isEmpty(){
        return publicBookList.size() < 1;
    }
    
    private final IOControl ioControl;
    ArrayList<Book> publicBookList;
    Scanner scanner;
    private final String ADD_BOOK_TEXT;
}
