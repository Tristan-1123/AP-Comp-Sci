import java.util.Scanner;

public class Prog166i {
    public static void main(String[] args){
        int upper = 100;
        int lower = 0;
        int sum = 0;
        while(lower<=upper &&  upper <= 110){
            lower++;
            sum += lower;
            if(lower == upper){
                System.out.println("The sum of the numbers from 1 " + upper + " is " + sum);
                upper++;
                lower = 0;
                sum = 0;
            }

        }

    }
    
}
