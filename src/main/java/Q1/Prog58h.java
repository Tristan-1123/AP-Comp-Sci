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

        double A = p*( Math.pow(1+.01*r/n, n*t/365)-1);

        System.out.printf("The interest is $ %.2f\n",  A);
        System.out.printf("The Amount is $ %.2f\n",  (A + p));
    }
}
