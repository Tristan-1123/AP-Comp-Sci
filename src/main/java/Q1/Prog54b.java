package Q1;

import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num1 ");
        int num1 = input.nextInt();

        System.out.print("Please enter num2 ");
        int num2 = input.nextInt();

        System.out.print("Please enter num3 ");
        int num3 = input.nextInt();

        System.out.print("Please enter num4 ");
        int num4 = input.nextInt();

        int sum = num1 + num2 + num3 + num4;

        double av = (double)sum / 4;

        System.out.println("The sum is "+ sum +" and the average is " + av);


    }
}
