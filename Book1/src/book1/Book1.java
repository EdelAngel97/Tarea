/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book1;

/**
 *
 * @author LuisGuillermo
 */
public class Book1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    
    public Book1(String name,Author author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book1(String name,Author author,double price,int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    public String getname(){
        return this.name;
    }
    
    public Author getauthor(){
        return this.author;
    }
    
    public double getprice(){
        return this.price;
    }
    
    public int getqty(){
        return this.qty;
    }
    
    public void setprice(double price){
        this.price = price;
    }
    
    public void setqty(int qty){
        this.qty = qty;
    }
    
    @Override
    public String toString(){
        return "Book[name" + this.name + "Author" + author.toString() + "price"
                + this.price + "quantity" + this.qty;
    }
}
