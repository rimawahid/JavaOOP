
package oop;


public class Student {
    String name, gender;
    int roll;
    
    
    //Default constructor
    Student(){
        System.out.println("NO vlaue initialized");
    }
    
    //Parametrized constructor
    Student(String st_n, String st_g, int st_r){
        name = st_n;
        gender = st_g;
        roll = st_r;
    }
    
    //Method
    void showStInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Roll : "+ roll);
    }
}
