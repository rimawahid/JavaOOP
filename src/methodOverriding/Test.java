
package methodOverriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "MR X";
        t1.age = 30;
        t1.phone = 123435445;
        t1.salary = 20000;
        t1.displayInfo();
    }
}
