package Q1;
import java.util.*;
public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular prism.");
        System.out.println("Enter length.");
        int length = input.nextInt();
        System.out.println("Enter Width.");
        int width = input.nextInt();
        System.out.println("Enter height.");
        int height = input.nextInt();
        int volume = length*width*height;
        System.out.println("The volume is: " + volume);

        System.out.println("Sphere.");
        System.out.println("Enter Radius.");
        double radius = input.nextInt();
        double diam = 2*radius;
        double volume2 = (3.14*(diam*diam*diam))/6 ;
        System.out.println("The volume is: " + volume2);

        System.out.println("Cube.");
        System.out.println("Enter the length of each side.");
        int leng = input.nextInt();
        int volume3 = leng*leng*leng;
        System.out.println("The volume is: " + volume3);
    }
}
