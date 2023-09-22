package Q1;
import java.util.*;
public class Prog122h {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv < 20){
            lcv++;
            System.out.println(lcv + " "+ Math.pow(lcv,2) + " " + Math.sqrt(lcv) + " " + Math.pow(lcv,3) + " " +Math.sqrt(Math.sqrt(lcv)) );
        }
    }
}
