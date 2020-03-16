import java.lang.Math.*;
import java.util.Scanner;
class ShapeTester {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Box box = new Box(0, 0, 0);
    Sphere sphere = new Sphere(0);
    Pyramid pyramid = new Pyramid(0, 0, 0);
    boolean running = true;
    System.out.println("Please enter shape number, 1 = Box, 2 = Sphere, or 3 = Pyramid?");
    while(running = true){
      int shape = scanner.nextInt();
      switch (shape){
          System.out.println("Okay, lets calulate a box!");
     	  System.out.println("Enter length:");
          int bLength = scanner.nextInt();
          box.l = bLength;
          System.out.println("Enter width:");
          int bWidth = scanner.nextInt();
          box.w = bWidth;
          System.out.println("Enter height:");	
          int bHeight = scanner.nextInt();
          box.h = bHeight;
          double boxVol = box.getVolume();
          System.out.println("Box Volume = " + boxVol);
          double boxSurfArea = box.getSurfArea();
          System.out.println("Box Surface Area = " + boxSurfArea);
          System.out.println("Would you like to enter number for another shape?, 1 = Box, 2 = Sphere, or 3 = Pyramid?")      
          break;

          System.out.println("Okay, lets calulate a sphere!");
     	  System.out.println("Enter radius:");
          double sRadius = scanner.nextDouble();
          sphere.r = sRadius;
          double sphereVol = sphere.getVolume();
          System.out.println("Sphere Volume = " + sphereVol);
          double sphereSurfArea = sphere.getSurfArea();
          System.out.println("Sphere Surface Area = " + sphereSurfArea);
          System.out.println("Would you like to enter number for another shape?, 1 = Box, 2 = Sphere, or 3 = Pyramid?");   
    break;

          System.out.println("Okay, lets calulate a pyramid!");
     	  System.out.println("Enter length:");
          double pLength = scanner.nextInt();
          pyramid.l = pLength;
          System.out.println("Enter width:");
          double pWidth = scanner.nextInt();
          pyramid.w = pWidth;
          System.out.println("Enter height:");	
          double pHeight = scanner.nextInt();
          pyramid.h = pHeight;
          double pyramidVol = pyramid.getVolume();
          System.out.println("Pyramid Volume = " + pyramidVol);
          double pyramidSurfArea = pyramid.getSurfArea();
          System.out.println("Pyramid Surface Area = " + pyramidSurfArea);
          System.out.println("Would you like to enter number for another shape?, 1 = Box, 2 = Sphere, or 3 = Pyramid?");
          break;
          
        default :
          System.out.println( "Not a valid shape.");
          System.out.println("Please enter number for another shape, 1 = Box, 2 = Sphere, or 3 = Pyramid?");
          running = false;
      }
    } 
  }
}
