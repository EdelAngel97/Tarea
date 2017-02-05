/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author LuisGuillermo
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public int gethour(){
        return this.hour;
    }
    
    public int getminute(){
        return this.minute;
    }
    
    public int getsecond(){
        return this.second;
    }
    
    public void sethour(int hour){
        this.hour = hour;
    }
    
    public void setminute(int minute){
        this.minute = minute;
    }
    
    public void setsecond(int second){
        this.second = second;
    }
    
    public void setTime(int hour,int minute,int second){
        
    }
    
    @Override
    public String toString() {
        return String.format("%02d",this.hour) + "/"
        + String.format("%02d",this.minute) + "/"
        + String.format("%02d",this.second);
    }
    public Time nextSecond(){
        ++this.second;
        if(this.second>=60){
            this.second = 0;
            ++this.minute;
            if(this.minute>=60){
                this.minute = 0;
                ++this.hour;
                if(this.hour>=24){
                    this.hour = 0;
                }
            }
        }
    return this;
    }
    public Time previousSecond(){
        --this.second;
        if(this.second>=60){
            this.second = 0;
            --this.minute;
            if(this.minute>=60){
                this.minute = 0;
                --this.second;
                if(this.second>=60){
                    this.second = 0;
                }
            }
        }
        return this;
    }
}

