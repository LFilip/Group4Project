/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        myPreferenceList = new ArrayList<>();
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
    public void addMedia(Media media){
        if(searchListByTitle(media.getTitle()) != null){
            System.out.println("This book is already in your list");
            return;
        }
        
        myBookList.add(media);
        System.out.println("The book " + media.getTitle() + " has been added to your list.");
    }
    
    /**
     *
     * @return will return a list of top favorites.
     */
    public ArrayList<String> generateTopTags(){
        final Map<String, Integer> counter = new HashMap<String, Integer>();
        
        for (Media media: myBookList){
            for (String str : media.getTags())
                counter.put(str, 1 + (counter.containsKey(str) ? counter.get(str) : 0));

            myPreferenceList = new ArrayList<String>(counter.keySet());

            Collections.sort(myPreferenceList, new Comparator<String>() {
                @Override
                public int compare(String x, String y) {
                    return counter.get(y) - counter.get(x);
                }
            });
        }
        
        return myPreferenceList;
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
    public void addMediaWishList(Media media){
        myWishList.add(media);
        System.out.println("The media " + media.getTitle() + " has been added to your Wishlist.");
   }
    
    /**
     *
     */
    public void printList(){
        for (int i = 0; i < myBookList.size();i++){
            System.out.println("Media: " +(i + 1) + " " + myBookList.get(i));
        }
    }
    
    /**
     *
     */
    public void printWishList(){
            for (int i = 0; i < myWishList.size();i++){
            System.out.println("Media: " +(i + 1) + " " + myBookList.get(i));
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
    
    public ArrayList<Media> getUserMediaList(){
        return myBookList;
    }
    
    /**
     *
     * @param searchTitle
     * @return
     */
    public Media searchListByTitle(String searchTitle){
        for (Media book : myBookList){
            if (book.getTitle().equals( searchTitle)){
                System.out.println("Media found with title: " + book.getTitle());
                return book;
                
            }
        }
        System.out.println("No Media found with that title");
        return null;
    }
    
    public Media searchListByIndex(int index ){
        index --;
        return myBookList.get(index);
    }
    
    private int idNumber;
    private ArrayList<Media> myWishList;
    private ArrayList<Media> myBookList;
    private ArrayList<String> myPreferenceList;
    private String name;
    private String password;
}
