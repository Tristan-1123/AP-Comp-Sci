package Q1;
import java.util.*;
import java.util.Scanner;

public class prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number A ");
        double A = input.nextInt();

        System.out.print("Enter number B ");
        double B = input.nextInt();

        System.out.print("Enter number C ");
        double C = input.nextInt();

        double root1 = (-B + java.lang.Math.sqrt((B*B) - 4*A*C) )/ (2*A);
        double root2 = (-B - java.lang.Math.sqrt((B*B) - 4*A*C) )/ (2*A);

        System.out.print("The roots are " + root1 + " " + root2);

    }
}
