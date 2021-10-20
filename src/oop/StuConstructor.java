
package oop;


public class StuConstructor {
    public static void main(String[] args) {
        //parametrized constructor
        Student stu1 = new Student("Rima", "Female", 345);
        stu1.showStInfo();
        
        
        //Default constructor
        Student stu2 = new Student();
        stu2.showStInfo();
    }
}
