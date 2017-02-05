/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author LuisGuillermo
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name){
        this(id, name, 0);
    }
    
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getid(){
        return this.id;
    }
    
    public String getname(){
        return this.name;
    }
    
    public int getbalance(){
        return this.balance;
    }
    
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    
    public int debit(int amount){
        if(amount <= balance){
            this.balance -= amount;
        }else{
            System.out.println("Amount exceed balance");
        }
        return this.balance;       
    }
    
    public int TransferTo(Account another, int amount){
        if(amount <= this.balance){
            another.credit(amount);
            this.balance -= amount;
        }else{
            System.out.println("Account exceed balance");
                    
        }
       return this.balance; 
    }
    
    @Override
    public String toString(){
        return "Account" + this.id + "id" + this.name + "name" + this.balance + "balance";
        
    }

}
