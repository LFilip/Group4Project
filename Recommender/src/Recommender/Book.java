/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author louis
 */
public class Book implements Serializable{
    
    public Book(){
        this.relatedBooks = new ArrayList<>();
        this.TAGS = new ArrayList<>();
    }
    
    /**
     *
     * @param newPublisher
     */
    public void setPublisher(String newPublisher){
        publisher = newPublisher;
    }

    /**
     *
     * @param newAuthor
     */
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    /**
     *
     * @param newTitle
     */
    public void setTitle(String newTitle){
        title = newTitle;
    }

    /**
     *
     * @return
     */
    public String getTitle(){
        return title;
    }
    
    /**
     *
     * @param newGenre
     */
    public void setGenre(String newGenre){
        genre = newGenre;
    }
    
    /**
     * 
     * @return
     */
    public String getGenre(){
        return genre;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<String> getTags(){
        return new ArrayList<String>();
    }
    
    /**
     *
     * @return will return a string to represent this object
     */
    @Override
    public String toString() {
            return "Book Title: " + title+ ", Author: " + author
                            + "";
    }
   
    private ArrayList<Integer> starRating;
    private ArrayList<String> Reviews;
    private ArrayList<String> TAGS;
    private ArrayList<Book> relatedBooks;
    private String author;
    private String title;
    private String publisher;
    private String genre;
    private int publishYear;
   
}
