package Q2;
import java.util.*;

public class MSOE_3_Lens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Refractive index of material");
        double n = input.nextDouble();
        System.out.println("Enter the Thickness of the lens");
        double d = input.nextDouble();
        System.out.println("Enter the first radii of the spherical lens");
        double r1 = input.nextDouble();
        System.out.println("Enter the second radii of the spherical lens");
        double r2 = input.nextDouble();

        double tempo = (n-1)*(1/r1 - 1/r2 + ((n-1)*d)/(n*r1*r2));
        System.out.println(tempo);
    }
}
