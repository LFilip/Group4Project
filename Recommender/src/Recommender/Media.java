/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class Media implements Serializable {
    protected ArrayList<Integer> starRatings;
    protected ArrayList<String> Reviews;
    protected ArrayList<String> TAGS;
    protected ArrayList<Book> relatedBooks;
    protected String author;
    protected String title;
    protected String publisher;
    protected String genre;
    protected int publishYear;

    
     public Media(){
        this.relatedBooks = new ArrayList<>();
        this.TAGS = new ArrayList<>();
        this.Reviews = new ArrayList<>();
        this.starRatings = new ArrayList<>();
    }
     
     
    void printDetails() {
        System.out.println(title);
    }

    void printReviews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected enum Type{
        Book, Movie, VideoGame, Music
    }
    protected Type type;
    
    /**
     *
     * @param newType
     */
    public void setType(Type newType){
        type = newType;
    }
    
    /**
     *
     * @returns the type of media it is.
     */
    public Type getType(){
        return type;
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
    public String getAuthor() {
        return author;
    }

    String getPublisher() {
        return publisher;
    }
   
    /**
     *
     * @return
     */
    public int getYearPublished(){
        return publishYear;
    }
    
    /**
     *
     * @return title of media
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * 
     * @return genre of the media
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
    
      public void addReview(String review, int reviewNumber){
        Reviews.add(review);
        starRatings.add(reviewNumber);
        System.out.println("Review Added: ");
    }

}
