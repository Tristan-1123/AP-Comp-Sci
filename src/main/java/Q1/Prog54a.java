package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // int, double, boolean, String
        System.out.print("Enter the car model ");
        String model = keyboard.nextLine();

        System.out.print("Enter Miles Driven ");
        int miles = keyboard.nextInt();

        System.out.print("Enter Gallons used ");
        int gallons = keyboard.nextInt();

        double mpg = miles/(double)gallons;
        System.out.println("MPG used by " + model +" is " + mpg + " m/g");
        /*
Enter the car model Honda
Enter Miles Driven 55
Enter Gallons used 12
MPG used by Honda is 4.583333333333333 m/g
         */
    }
}
