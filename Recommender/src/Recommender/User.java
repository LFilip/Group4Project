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
    
    
    public void printList(){
        for (int i = 0; i < myBookList.size();i++){
            System.out.println("Book: " +(i + 1) + " " + myBookList.toString());
        }
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
    private ArrayList<Book> myBookList;
    private String name;
    private String password;
}
