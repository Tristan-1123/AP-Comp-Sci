package Q1;
import java.util.*;
public class prog122f {
    public static void main(String[] args) {
        int lcv = -26;
        while(lcv<25){
            lcv++;
            System.out.println("Number     Cube     Cube Root");
            System.out.println(lcv + " " + Math.pow(lcv,3) + " "+ Math.cbrt(lcv));
        }
    }
}
