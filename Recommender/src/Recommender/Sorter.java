/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.Comparator;

/**
 *
 * @author louis
 */
public class Sorter {
    
    
    public static Comparator<Media> RatingHighComparator = new Comparator<Media>() {

	public int compare(Media s1, Media s2) {
	   int media1 = s1.getRating();
	   int media2 = s2.getRating();

	   //ascending order
	   return media2 - media1;

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
}
