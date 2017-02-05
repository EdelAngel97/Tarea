/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author LuisGuillermo
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
   
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getid(){
        return this.id;
    }
    
    public String getfirstName(){
        return this.firstName;
    }
    
    public String getlastName(){
        return this.lastName;
    }
    
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    
    public int getsalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    
    public int raiseSalary(int percentage){
        this.salary += this.salary * percentage/100;
        
        return this.salary;
    }
    
    @Override
    public String toString(){
        return "Employee" + this.id + "name" + this.getName() + "salary" +
                this.salary + "";
    }

}
