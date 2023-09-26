package Q1;
import java.util.*;
public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter eggs");
        double eggs = input.nextDouble();
        double eggout = eggs%12;
        double ppd = 0;
        if (eggs <48) ppd =0.5;
        if (eggs >48 && eggs < 72) ppd =0.45;
        if (eggs >72 && eggs < 132) ppd =0.4;
        if (eggs > 132) ppd =0.35;


    }
}
