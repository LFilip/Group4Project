/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.*;

/**
 *
 * @author louis
 */
public class MediaDatabase {
        ArrayList<Media> publicMediaList;
        Scanner scanner;
        private final IOControl ioControl;
        private static MediaDatabase myDatabase;
        private final String ADD_BOOK_TEXT;
        
        private MediaDatabase (){
            this.ADD_BOOK_TEXT = "You have selected Add a Book\n"
                + "Please enter the Title of the new book";
            ioControl = IOControl.getInstance();
            this.scanner = new Scanner(System.in);
            File f = new File("BookList.ser");
                if (f.isFile()){
                    publicMediaList = ioControl.readBookFile();
                }
                else {
                    publicMediaList = new ArrayList<>();
                }
        }

        
        public static MediaDatabase getInstance(){
        if (myDatabase == null){
            myDatabase = new MediaDatabase();
            
        }
        return myDatabase;
        }
        
            /**
     * @author Louis Filip
     * @return returns a list of all the public books
     */
    public ArrayList<Media> getMediaList(){
        return publicMediaList;
    }
    
    
        /**
     *
     * @return The created book.
     */
    
    //   TODO: Fix the way this does this
    public Media addBook(){
        System.out.println(ADD_BOOK_TEXT);
        String newTitle = scanner.nextLine();
        
            Media newBook = new Media();
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
            

            System.out.println("Now write a short review about it and that should be all we need");
            String newReview = scanner.nextLine();

            newBook.setAuthor(newAuthor);
            newBook.setTitle(newTitle);
            newBook.setPublisher(newPublisher);
            newBook.setPublishYear(newPublishDate);
            newBook.setGenre(newGenre);
            newBook.addReview(newReview, newReviewNumber);

            publicMediaList.add(newBook);
            saveList(); 
            return newBook;
        }
        else {
            System.out.println("There is a book already that in the public list:");
            newBook = searchByTitle(newTitle);
            newBook.printDetails();
            System.out.println("\n Would you like to add this book to your list?");
            System.out.println("Press 1 to add to your list");
            System.out.println("Press 2 to return to the main menu");
            int menuControlInt = ioControl.getIntInput();
            switch(menuControlInt){
                case 1: return newBook;
                case 2: return null;
            }
            
        }
        return null;
    } 
    
    
 
    /**
     *
     * @return
     */
    public boolean saveList(){
        ioControl.writeBookFile(publicMediaList);
         return true;
    }

    private Media searchByTitle(String searchTitle) {
                for (Media book : publicMediaList){
            if (book.getTitle().equals( searchTitle)){
                System.out.println("Book found with title: " + book.getTitle());
                return book;
                
            }
        }
        System.out.println("No books found with that title");
        return null;
    }

    void printList() {
            for (Media book : publicMediaList){
            System.out.println((publicMediaList.indexOf(book) +1) + " :" +
            book.toString());
        }
    }

    Media getBookAtIndex(int bookIndex) {
               return publicMediaList.get(bookIndex - 1);
    }
}
