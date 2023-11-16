package Q2;
import java.util.*;
public class MSOE_2_Sine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of a");
        int len_a = input.nextInt();
        System.out.println("Enter length of c");
        int len_c = input.nextInt();
        System.out.println("Enter angle of a");
        double ang_a = Math.toRadians(input.nextDouble());
        double a_sin = Math.sin(ang_a);
        double idk = Math.asin(a_sin);
        System.out.println(idk);
        if(idk + ang_a < 180) System.out.println(180-idk);

    }
}
