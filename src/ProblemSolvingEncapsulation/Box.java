
package ProblemSolvingEncapsulation;

public class Box {
    double height,width,depth, volume;//instance variable 
     Box(double height, double width, double depth){
         this.height = height;
         this.width = width;
         this.depth = depth;
     }
     void displayVol(){
         volume = height*width*depth;
         System.out.println("volume is : " + volume); 
     }
     
}
