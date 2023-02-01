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
public class PartTimeStudent extends Student {
    
   private int noOfCourse; 

    public PartTimeStudent(String name) {
        super(name);
    }

    public int getNoOfCourse() {
        return noOfCourse;
    }

    public void setNoOfCourse(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }
}
