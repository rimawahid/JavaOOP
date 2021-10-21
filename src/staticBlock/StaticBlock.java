package staticBlock;

public class StaticBlock {

    String name;
    static int salary;

    static {
        salary = 1000;
    }

    static void showInfo() {
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.name = " Mr. X";
        System.out.println("Name : " +  sb.name);
        showInfo();
    }
}
