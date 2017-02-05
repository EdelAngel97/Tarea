/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author LuisGuillermo
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private double radius;
    
    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "Circle[radius="+this.radius+"]";
}

}
