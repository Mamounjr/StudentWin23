/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_software;

/**
 *
 * @author Admin
 */
public class Student {
    
    private String address;
    private String name;
    private String address2;
    
    public Student(){
        
    }
    
    public Student(String name){
        this.name = name;
    }
    
    public String getName(){
     
        return name;
    }
    
    public String getAddress(){
        
        return address;
    }      
}
