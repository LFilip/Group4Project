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
     * @param book
     */
    public void addBook(Book book){
        myBookList.add(book);
        System.out.println("The book " + book.getTitle() + " has been added to your list.");
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
    
   public void addBookWishList(Book book){
        myWishList.add(book);
        System.out.println("The book " + book.getTitle() + " has been added to your Wishlist.");
   }
    
    
    public void printList(){
        for (int i = 0; i < myBookList.size();i++){
            System.out.println("Book: " +(i + 1) + " " + myBookList.get(i));
        }
    }
    
    public void printWishList(){
            for (int i = 0; i < myWishList.size();i++){
            System.out.println("Book: " +(i + 1) + " " + myBookList.get(i));
        }
    }
    
    public int getBookListSize(){
        return myBookList.size();
    }
    
    public int getWishListSize(){
        return myWishList.size();
    }
    
    /**
     *
     */
    public void printBooks(){
        for (Book book : myBookList){
            System.out.println(book);
        }
    }
    
    private int idNumber;
    private ArrayList<Book> myWishList;
    private ArrayList<Book> myBookList;
    private String name;
    private String password;
}
