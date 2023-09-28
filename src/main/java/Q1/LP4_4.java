package Q1;
import java.util.*;
public class LP4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        if(op == 2){
            operator = "-";
            answer= one - two ;
        }
        if(op == 3){
            operator = "*";
            answer= one * two ;
        }
        if(op == 4){
            operator = "/";
            answer= one / two ;
        }
        System.out.println(one + " " + operator + " "+ two);
        System.out.println("Whats the answer?");
        int user = input.nextInt();
        if(user==answer)System.out.println("Correct!");
        else{
            System.out.println("WRONG");
        }



    }
}
