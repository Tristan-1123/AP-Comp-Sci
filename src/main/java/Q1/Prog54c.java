package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        System.out.print("Enter diameter");
        double diam = input.nextDouble();

        double rad = diam / 2;

        double area = pi * (rad * rad);

        double circum = pi * rad;
    }
}
