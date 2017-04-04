/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *  This Class will be a singleton that will handle all the input and output from the files.
 * @author Group 4
 */
public class IOControl {
    
    private static IOControl ioControl;
    
    private IOControl(){
        this.scanner = new Scanner(System.in);
        
    }
    
    public static IOControl getInstance(){
        if (ioControl == null){
            ioControl = new IOControl();
            
        }
        return ioControl;
    }
    
    /**
     *
     * @param o This parameter is a seriealizable object
     * @return true if it worked and false if it failed
     */
    public boolean writeBookFile(ArrayList<Media> o){
    
        try {
            FileOutputStream fileOut =
            new FileOutputStream("BookList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in BookList.ser");
         }catch(IOException i) {
            System.out.println("This didnt work");
            i.printStackTrace();
            return false;
         }

        return true;
    }
     
    /**
     *
     * @param o
     * @return
     */
    public boolean writeUserFile(ArrayList<User> o){
        try {
            FileOutputStream fileOut =
            new FileOutputStream("UserList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in BookList.ser");
         }catch(IOException i) {
            System.out.println("This didnt work");
            i.printStackTrace();
         }

        return true;
    }

    
    /**
     *
     * @return
     */
    public ArrayList<User> readUserFile(){
       System.out.println("Attempting to open UserList.ser");
       File f = new File("UserList.ser");
       if (f.isFile()){
       try {
         FileInputStream fileIn = new FileInputStream("UserList.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         userList = (ArrayList<User>) in.readObject();
         System.out.println("UserList Opened Successfully");
         in.close();
         fileIn.close();
      }catch(IOException i) {
          System.out.println("There is no file yet!");
         i.printStackTrace();
      }catch(ClassNotFoundException c) {
         System.out.println("BookList not found You will need to make a new one"); 
         c.printStackTrace();
      }
         return userList;
     }
       System.out.println("There is no file to open. Feel free to create a new one.");
       return new ArrayList<>();
    }
    
    
    
    public ArrayList<Media> readBookFile(){
       System.out.println("Attempting to find BookList.ser");
       File f = new File("BookList.ser");
       if (f.isFile()){
       try {
         FileInputStream fileIn = new FileInputStream(f);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         publicBookList = (ArrayList<Media>) in.readObject();
         System.out.println("BookList.Ser Opened Sucessfully");
         in.close();
         fileIn.close();
      }catch(IOException i) {
          System.out.println("There is no file yet!");
         i.printStackTrace();
      }catch(ClassNotFoundException c) {
         System.out.println("BookList not found You will need to make a new one"); 
         c.printStackTrace();
      }
         return publicBookList;
     }
       System.out.println("There is no file to open. Feel free to create a new one.");
       return new ArrayList<>();
    }
    
    
    public int getIntInput(){
        int actNum = 0;
    while (!scanner.hasNextInt()) {
        // Out put error
        System.out.println("Please enter only digits.");
        scanner.next();//Go to next
    }
    actNum = scanner.nextInt();
    return actNum;
    }
    
    Scanner scanner;
     ArrayList<User> userList;
     ArrayList<Media> publicBookList;
}
