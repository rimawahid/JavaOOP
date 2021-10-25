
package ProblemSolvingAbstract;

public class Cricle extends Shape {
    Cricle(double r){
        super(r,r);
    }
    void area(){
        double result = 3.1416 *dim1* dim2;
        System.out.println("Cricle area : " + result);
    }
}
