/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

/**
 *
 * @author LuisGuillermo
 */
public class MyPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private int x;
    private int y;
    
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public int x(){
        return this.x;
    }
    
    public int y(){
        return this.y;
    }
    
    public int[] xy(){
        int[] array = {2};
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }
    
    public void setx(int x){
        this.x = x;
    }
    
    public void sety(int y){
        this.y = y;
    }
    
    public void xy(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return (this.x + "," + this.y);
    }
    
    public double distance(int x,int y){
          return Math.sqrt((Math.pow(this.x-x,2))+(Math.pow(this.y-y,2)));
    }
    
    public double distance(MyPoint another){
        return Math.sqrt((Math.pow(this.x-another.x,2))
                +(Math.pow(this.y-another.y,2)));
    }
    
    public double distance(){
        return Math.sqrt((Math.pow(this.x,2))
                +(Math.pow(this.y,2)));
    }
    
}
