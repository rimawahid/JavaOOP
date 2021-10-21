
package MethodOverloading;

public class MethodOverloading {
    void add(){
        System.out.println("No Parameter");
    }
    void add(int a, int b){
        int result = a+b;
        System.out.println("Result :" + result);
    }
    void add(double a, double b){
        double result = a+b;
         System.out.println("Result :" + result);
    }
    void add(int a, int b, int c){
        int result = a+b+c;
        System.out.println("Result :" + result);
    }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add();
        mo.add(10, 20);
        mo.add(4.5, 5.5);
        mo.add(5, 6, 9);
    }
    
}
