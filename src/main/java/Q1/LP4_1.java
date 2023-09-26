package Q1;
import java.util.*;
public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of copies");
        double copies = input.nextDouble();
        double price = 0;
        double total = 0;
        if (copies <= 99) {
            price = 0.3;
            total = price * copies;
            System.out.println("The price per copy is $"+  price);
            System.out.printf("The Total price is  %.2f\n",  total);
        }
        if (copies > 99 && copies <= 499) {
            price = 0.28;
            total = price * copies;
            System.out.println("The price per copy is $"+  price);
            System.out.printf("The Total price is  %.2f\n",  total);
        }
        if (copies > 500 && copies <= 749) {
            price = 0.27;
            total = price * copies;
            System.out.println("The price per copy is $"+  price);
            System.out.printf("The Total price is  %.2f\n",  total);
        }
        if (copies > 500 && copies <= 749) {
            price = 0.27;
            total = price * copies;
            System.out.println("The price per copy is $" + price);
            System.out.printf("The Total price is  %.2f\n", total);
        }
        if(copies > 750 && copies <= 1000){
            price = 0.26;
            total = price * copies;
            System.out.println("The price per copy is $"+  price);
            System.out.printf("The Total price is  %.2f\n",  total);
    }
        if( copies > 1000){
            price = 0.25;
            total = price * copies;
            System.out.println("The price per copy is $"+  price);
            System.out.printf("The Total price is  %.2f\n",  total);
        }}}