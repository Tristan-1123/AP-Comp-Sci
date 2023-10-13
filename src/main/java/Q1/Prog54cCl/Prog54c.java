package Q1.Prog54cCl;
import java.util.*;
public class Prog54c {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner input = new Scanner(System.in);
        int diam = input.nextInt();
        Cl54c nu = new Cl54c(diam);
        nu.calc();
        System.out.println(nu);
    }
}
