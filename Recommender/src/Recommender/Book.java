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
    
    


    public Book(){
        this.relatedBooks = new ArrayList<>();
        this.TAGS = new ArrayList<>();
        this.Reviews = new ArrayList<>();
        this.starRatings = new ArrayList<>();
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

    
    void printReviews() {
        if (Reviews.size() <= 0){
            for (String string : Reviews){

            }
        } else {
            System.out.println("There are not any reviews yet.");
            
        }
    }
}
