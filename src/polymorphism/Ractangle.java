
package polymorphism;

public class Ractangle extends Shape {
    double height,width;

    public Ractangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    double area(){
        System.out.print("Area for Rectangle : ");
        return height*width;
    }
}
