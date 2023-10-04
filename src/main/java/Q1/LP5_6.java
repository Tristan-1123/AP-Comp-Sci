package Q1;
import java.util.*;
public class LP5_6 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lcv = 0;
        int temp = 0;
        int total = 0;
        while(lcv <num){
            temp = num%10;
            total += temp;
            num = num/10;

        }
        System.out.println(total);
    }
}