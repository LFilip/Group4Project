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
public class Book extends Media implements Serializable {
    
    
    private ArrayList<Integer> starRatings;
    private ArrayList<String> Reviews;
    private ArrayList<String> TAGS;
    private ArrayList<Book> relatedBooks;
    private String author;
    private String title;
    private String publisher;
    private String genre;
    private int publishYear;

    public Book(){
        this.relatedBooks = new ArrayList<>();
        this.TAGS = new ArrayList<>();
        this.Reviews = new ArrayList<>();
        this.starRatings = new ArrayList<>();
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
     * @param newGenre
     */
    public void setGenre(String newGenre){
        genre = newGenre;
    }

    /**
     *
     * @param newPublishYear
     */
    public void setPublishYear(int newPublishYear){
        publishYear = newPublishYear;
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
        return TAGS;
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
    
    /**
     *
     */
    public void printDetails(){
        System.out.println("================================================");
        System.out.println(" Title: " + title + " Author: " + author);
        System.out.println(" Publisher: " + publisher + " Published in: " + publishYear);
        System.out.println(" Genre: " + genre );
    }
  
    
    /**
     *  takes in the created documents and will hold it but will not interact with it.
     * @param review
     * @param reviewNumber
     * @return
     */
  public void addReview(String review, int reviewNumber){
        Reviews.add(review);
        starRatings.add(reviewNumber);
        System.out.println("Review Added: ");
    }
   
    public String getAuthor() {
        return author;
    }

    String getPublisher() {
        return publisher;
    }
   
    public int getYearPublished(){
        return publishYear;
    }

    void printReviews() {
        if (Reviews.size() <= 0){
            for (String string : Reviews){

            }
        } else {
            System.out.println("There are not any reviews yet.");
            
        }
    }
}
