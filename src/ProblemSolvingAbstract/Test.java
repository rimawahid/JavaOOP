
package ProblemSolvingAbstract;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape = new Triangle(10,20);
        shape.area();
        shape = new Rectangle(10,20);
        shape.area();
        shape = new Cricle(10);
        shape.area();
        
    }
}
