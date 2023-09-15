package Q1;

import java.util.Scanner;

public class Lang65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter Pounds ");
        double pounds = input.nextDouble();
        System.out.print("enter shillings ");
        double shillings = input.nextDouble();
        System.out.print("enter pence ");
        double pence1 = input.nextDouble();
        double pence = pence1*0.01;
        double trupence = shillings * 0.05;
        double trupence2 = pence/2.4;
        double total = trupence + trupence2 + pounds;
        System.out.printf("%.2f\n",total);


    }
}
