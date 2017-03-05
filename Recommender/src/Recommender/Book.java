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
    
    public void setPublisher(String newPublisher){
        publisher = newPublisher;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getTitle(){
        return title;
    }
    
    public ArrayList<String> getTags(){
        return new ArrayList<String>();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
            return "Book Title: " + title+ ", Publisher: " + publisher
                            + "";
    }
    
    private ArrayList<String> TAGS;
    private String author;
    private String title;
    private String publisher;
    private int publishYear;
    private ArrayList<Book> relatedBooks;
}
