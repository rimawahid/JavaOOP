package returningVAlue;

public class Test {
    
    public static void main(String[] args) {
        ReturningValue val1 = new ReturningValue();
        int result = val1.square(7);
//        int result2 = val1.square(5);
        System.out.println("Result : " + result);
        System.out.println("Result : " + val1.square(8));
    }
}
