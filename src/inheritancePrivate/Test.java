package inheritancePrivate;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Mr X");
        t1.setAge(30);
        t1.Phone = 12354567;

        System.out.println("Name : " + t1.getName());
        System.out.println("AGe : " + t1.getAge());
        t1.display2();

    }
}
