/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 4.1
 * File Name: Television.java
 */

//

public class Television {
    
    //Objects for Television
    private double price;
    private String brand;
    private int screenSize;

    //consructor
    Television(){
        price = 0;
        brand = "null";
        screenSize = 0;
    }
    
    //mutators
    public void setPrice(double price){
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }
    
    //accessors
    public double getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public int getScreenSize(){
        return screenSize;
    }
    
    //toString
    public String toString(){        
        return Double.toString(price) + " " + brand + " " 
                + Integer.toString(screenSize);
    }
}