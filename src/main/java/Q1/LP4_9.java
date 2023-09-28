package Q1;
import java.util.*;
public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int one = rand.nextInt(1,21);
        System.out.println("Guess a number between 1 and 20!");
        int two = input.nextInt();
        System.out.println("Computer number: "+ one);
        System.out.println("User number: "+ two);
        if(one==two) System.out.println("You Win!");
        else{
            System.out.println("You lose");
        }
    }
}

//    Guess a number between 1 and 20!
//        9
//        Computer number: 3
//        User number: 9
//        You lose