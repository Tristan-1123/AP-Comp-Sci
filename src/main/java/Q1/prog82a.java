package Q1;
import java.util.*;
public class prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed limit");
        int limit = input.nextInt();
        System.out.println("Enter the speed");
        int over = input.nextInt();
        int fine = 0;
        if (limit>over) fine = 0;
        else fine = ((over%limit) *5)+20;
        System.out.println("The fine is "+ fine);

    }
}
