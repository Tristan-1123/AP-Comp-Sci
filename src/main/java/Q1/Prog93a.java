package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter KWH ");
        double kwh = input.nextDouble();

        double base = 0.0475;
        double based = base * kwh;
        double sur = 0.1 * based;
        double tac = 0.03 * based;
        double total = sur + tac + based;
        double late_total = total + (total*0.04);
        System.out.printf("The total is %.2f\n",  total);
        System.out.printf("The late total is %.2f\n",  late_total);
    }
}
