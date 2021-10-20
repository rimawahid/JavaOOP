
package staticKeyword;

public class Student {
    String name;
    int roll;
    static String university = "National university";
    
    Student(String n, int r){
        name = n;
        roll = r;
    }
    
    void getInfo(){
        System.out.println("name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("University : "+ university);
    }
}
