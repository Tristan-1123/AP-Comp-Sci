package Q1;
import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Pass = "Computer1776!";
        int lcv = 0;
        while(lcv<3){
            System.out.println("Enter Password");
            String enter = input.nextLine();
            if (!Pass.equals(enter)){
                System.out.println("Incorrect");
                lcv++;
                if(lcv==3) System.out.println("Acess denied");
            }
            else if (Pass.equals(enter)){
                System.out.println("Acess Granted");
                lcv=4;
            }
        }

    }
}
