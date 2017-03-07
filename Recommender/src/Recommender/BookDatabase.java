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
    
    /**
     *
     * @return The created book.
     */
    
    //   TODO: Fix the way this does this.
    public Book addBook(){
        System.out.println(ADD_BOOK_TEXT);
        String newTitle = scanner.nextLine();
        
            Book newBook = new Book();
        if(searchByTitle(newTitle) == null){
            System.out.println("Now enter the Author");
            String newAuthor = scanner.nextLine();

            System.out.println("Excellent, now when was it published");
            int newPublishDate = ioControl.getIntInput();

            System.out.println("Who published this book");
            String newPublisher = scanner.nextLine();


            System.out.println("Now enter what genre it is in:");
            String newGenre = scanner.nextLine();

            System.out.println("Please enter a number rating out of 5");
            int newReviewNumber = ioControl.getIntInput();       
            newGenre = newGenre.toLowerCase();

            System.out.println("Now write a short review about it and that should be all we need");
            String newReview = scanner.nextLine();


            newBook.setAuthor(newAuthor);
            newBook.setTitle(newTitle);
            newBook.setPublisher(newPublisher);
            newBook.setGenre(newGenre);
            newBook.addReview(newReview, newReviewNumber);

            publicBookList.add(newBook);
            saveList(); 
        return newBook;
        }
        else {
            System.out.println("There is a book already that in the public list:");
            newBook = searchByTitle(newTitle);
            return newBook;
        }

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
    
    public Book getBookAtIndex(int index){
        return publicBookList.get(index - 1);
    }
    
    /**
     * @author Louis Filip
     * @return
     */
    public boolean isEmpty(){
        return publicBookList.size() < 1;
    }
    
    public void addReviewToBook(Book book){
        
    }
    
    public Book searchByTitle(String searchTitle){
        for (Book book : publicBookList){
            if (book.getTitle() == searchTitle){
                System.out.println("Book found with title: " + book.getTitle());
                return book;
                
            }
        }
        System.out.println("No books found with that title");
        return null;
    }
    
    public void printBookDetails(int index){
        index--;
        Book book = publicBookList.get(index);
        System.out.println("Details:\n" +
                "-------------------------------\n" +
                "Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor());
        
        System.out.println("Publisher: " + book.getPublisher() + " Published in: " + book.getYearPublished() + " Genre: " + book.getGenre());

        
        
    }
    
    public void printBookReviews(int index ){
        index--;
    }
    
    public void addReview(int index){
        index--;
    }
    
    
    
    private final IOControl ioControl;
    ArrayList<Book> publicBookList;
    Scanner scanner;
    private final String ADD_BOOK_TEXT;
}
