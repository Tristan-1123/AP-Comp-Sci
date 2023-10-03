package Q1;
import java.util.*;
public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree of an angle");
        double angle = input.nextDouble();
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        System.out.printf("sin: %.2f\n", sin );
        System.out.printf("cos: %.2f\n", cos);
        System.out.printf("tan: %.2f\n", tan);

    }
}
