/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.ArrayList;
import java.io.*;

/**
 * @author Group 4
 * 
 */
public class User implements Serializable {

    private UserDatabase userDatabase;

    /**
     *
     * @param newName
     * @param newPassword
     * @param newIDnumber
     */
    public User(String newName, String newPassword, int newIDnumber) {
        myBookList = new ArrayList<>();
        myWishList = new ArrayList<>();
        name = newName;
        password = newPassword;
        idNumber = newIDnumber;
    }
    
    /**
     * @author Group 4
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     * @author Group 4
     * @return
     */
    public String getPassword(){
        return password;
    }
    
    /**
     *
     * @param media
     */
    public void addBook(Media media){
        if(searchListByTitle(media.getTitle()) != null){
            System.out.println("This book is already in your list");
            return;
        }
        
        myBookList.add(media);
        System.out.println("The book " + media.getTitle() + " has been added to your list.");
    }
    
    
    /**
     *
     * @param index
     * @return
     */
    public boolean removeBook(int index ){
        
        myBookList.remove(index - 1);
        return true;
    }
    
    /**
     *
     * @param book
     */
    public void addBookWishList(Media book){
        myWishList.add(book);
        System.out.println("The book " + book.getTitle() + " has been added to your Wishlist.");
   }
    
    /**
     *
     */
    public void printList(){
        for (int i = 0; i < myBookList.size();i++){
            System.out.println("Book: " +(i + 1) + " " + myBookList.get(i));
        }
    }
    
    /**
     *
     */
    public void printWishList(){
            for (int i = 0; i < myWishList.size();i++){
            System.out.println("Book: " +(i + 1) + " " + myBookList.get(i));
        }
    }
    
    /**
     *
     * @return
     */
    public int getBookListSize(){
        return myBookList.size();
    }
    
    /**
     *
     * @return
     */
    public int getWishListSize(){
        return myWishList.size();
    }
    
    /**
     *
     */
    public void printBooks(){
        for (Media book : myBookList){
            System.out.println(book);
        }
    }
    
    /**
     *
     * @param searchTitle
     * @return
     */
    public Media searchListByTitle(String searchTitle){
        for (Media book : myBookList){
            if (book.getTitle().equals( searchTitle)){
                System.out.println("Book found with title: " + book.getTitle());
                return book;
                
            }
        }
        System.out.println("No books found with that title");
        return null;
    }
    
    public Media searchListByIndex(int index ){
        index --;
        return myBookList.get(index);
    }
    
    private int idNumber;
    private ArrayList<Media> myWishList;
    private ArrayList<Media> myBookList;
    private String name;
    private String password;
}
