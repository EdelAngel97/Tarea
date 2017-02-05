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
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name,Author[] authors,double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name,Author[] authors,double price,int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getname(){
        return this.name;
    }
    
    public Author[] getauthors(){
        return this.authors;
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
        return "Book[name" + this.name + "Authors" + getAuthorNames() + "price"
                + this.price + "quantity" + this.qty;
    }
    
    public String getAuthorNames(){
        String a = "";
        for(int i=0;i<authors.length;i++){
            a += authors[i].toString() + ",";
        }
        return "author names=" + a;
    }
}
