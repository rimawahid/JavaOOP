
package superKeyword;

public class ClassB extends ClassA {

    public ClassB() {
        System.out.println("Hello B ");
    }
    void show(){
        super.show();
        System.out.println("This is class B");
    }
    
}
