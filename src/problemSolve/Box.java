
package problemSolve;

public class Box {
    double height,width,depth, volume;
     Box(double h, double w, double d){
         height = h;
         width = w;
         depth = d;
     }
     void displayVol(){
         volume = height*width*depth;
         System.out.println("volume is : " + volume); 
     }
     
}
