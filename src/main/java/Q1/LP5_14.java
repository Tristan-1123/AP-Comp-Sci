package Q1;
import java.util.*;
public class LP5_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lcv = 1;
        while(lcv<=5){
            int rol = rand.nextInt(1,6);
            int roll = rand.nextInt(1,6);
            System.out.println(rol + " " + roll+ " " + (rol+roll));
            lcv++;
        }

    }
}
