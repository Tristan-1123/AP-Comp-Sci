package Q1;
import java.util.*;
public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price ");
        double p = input.nextDouble();

        System.out.print("Paid ");
        double c = input.nextDouble();

        double change = c-p;

        double dol = Math.floor(change/1.0);
        double q = Math.floor((change-dol)/ 0.25);
        double d = Math.floor(((change-dol)-(q*0.25))/ 0.10);
        double n = Math.floor((((change-dol)-(q*0.25)) - (0.1*d))/0.05);
        double penny = Math.floor(((((change-dol)-(q*0.25))-(d*0.1))-(n*0.05))/ 0.01);

        System.out.println( dol + " dollars");
        System.out.println( q + " quarters");
        System.out.println( d + " dimes");
        System.out.println( n + " nickels");
        System.out.println( penny + " pennies");


    }
}
