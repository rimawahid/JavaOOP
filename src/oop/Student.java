
package oop;


public class Student {
    String name, gender;
    int roll;
    
    Student(String st_n, String st_g, int st_r){
        name = st_n;
        gender = st_g;
        roll = st_r;
    }
    void showStInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Roll : "+ roll);
    }
}
