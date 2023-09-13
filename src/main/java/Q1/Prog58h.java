package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount in account ");
        double p = input.nextDouble();

        System.out.print("Enter interest rate ");
        double r = input.nextDouble();

        System.out.print("Number of times compounded per year ");
        double n = input.nextDouble();

        System.out.print("Number of days at interest ");
        double t = input.nextDouble();

        double A = p*( 1+Math.pow(.01*r/n, n*t/365));

        System.out.println("The interest is $" + A);
    }
}
