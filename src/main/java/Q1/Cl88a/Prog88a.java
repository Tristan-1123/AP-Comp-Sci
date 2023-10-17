package Q1.Cl88a;
import java.util.*;
public class Prog88a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int asd = input.nextInt();
        System.out.println("Enter num2 ");
        int qwertt = input.nextInt();
        Cl88a nu = new Cl88a(asd,qwertt);
        nu.calc();
        System.out.println(nu);
    }
}
