package Q1;
import java.util.*;
public class LP5_5 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lcv = 0;
        int temp = 0;
        while(lcv <num){
            temp = num%10;
            System.out.println(temp);
            num = num/10;

        }
    }
}