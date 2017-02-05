/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceitem;

/**
 *
 * @author LuisGuillermo
 */
public class InvoiceItem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public String getid(){
        return this.id;
    }
    
    public String getdesc(){
        return this.desc;
    }
    
    public int qty(){
        return this.qty;
    }
    
    public double unitPrice(){
        return this.unitPrice;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    public void setdesc(String desc){
        this.desc = desc;
    }
    
    public void setqty(int qty){
        this.qty = qty;
    }
    
    public void setunitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public double getTotal(){
       return this.unitPrice * this.qty; 
    }
    
    @Override
    public String toString(){
        return "Invoice item" + this.id + "id" +  this.desc + "desc" + this.qty + "quantity" 
                + this.unitPrice + "Unit Price";
        
    }

}
