package Q1.Prog82aCl;
import Q1.Cl88a.Cl88a;

import java.util.*;
public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mph");
        int spe = input.nextInt();
        System.out.println("Enter limit");
        int limy = input.nextInt();
        Cl82a nu = new Cl82a(spe, limy);
        nu.cal();
        System.out.println(nu);


    }

}
