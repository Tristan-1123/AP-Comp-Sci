package Q1;
import java.util.*;
public class LP4_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int one = rand.nextInt(1,11);
        int two = rand.nextInt(1,11);
        int op = rand.nextInt(1,5);
        String operator = "";
        int answer = 0;
        if(op == 1){
            operator = "+";
            answer= one + two ;
        }

    }
}
