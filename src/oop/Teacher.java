
package oop;


public class Teacher {
    String name,gender;
    int phone;
    
    //Parametrized Method
    void setInfo(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    
    
    
    //Method
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
    }
}
