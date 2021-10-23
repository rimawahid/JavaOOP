
package methodOverriding;

public class Teacher extends Person {
    int phone;
    int salary;
    @Override
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
        System.out.println("Salary : " + salary);
    }
}
