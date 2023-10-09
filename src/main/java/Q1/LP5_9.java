package Q1;
import java.util.*;

public class LP5_9 {
    public static void main(String[] args) {
        int lcv = 1;
        System.out.println("x^1 x^2 x^3 x^4 x^5");
        while(lcv<=6){
            System.out.println(Math.pow(lcv,1) + " " + Math.pow(lcv,2) + " "+ Math.pow(lcv,3) + " "+ Math.pow(lcv,4) + " "+ Math.pow(lcv,5) );
            lcv++;

        }
    }
}
