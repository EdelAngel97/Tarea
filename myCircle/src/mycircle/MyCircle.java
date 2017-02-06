/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycircle;

/**
 *
 * @author LuisGuillermo
 */
public class MyCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private MyPoint center;
    private int radius;
    
    public MyCircle(){
        this.center = new MyPoint();
        this.radius = 1;
    }
    
    public MyCircle(int x,int y,int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center,int radius){
        this.center = center;
        this.radius = radius;
    }
    
    public int getradius(){
        return this.radius;
    }
    
    public MyPoint getCenter(){
        return this.center;
    }
    
    public int getCenterx(){
        return this.center.getx();
    }
    
    public int getCentery(){
        return this.center.gety();
    }
    
    public int[] getCenterxy(){
        return this.center.getxy();
    }
    
    public void setCenterx(int x){
        this.center.setx(x);
    }
    
    public void setCentery(int y){
        this.center.senty(y);
    }
    
    public void setCenterxy(int x,int y){
        this.center.sentxy(x,y);
    }
    
    @Override
    public String toString(){
        return "My Circle[radius" + this.radius + "center" + center + "]";
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    
    public double getCircumference(){
        return Math.PI * (this.radius * 2);
    }
    
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
