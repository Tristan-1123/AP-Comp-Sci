package Q1;
import java.util.*;
import java.util.Scanner;

public class Prog52aINPUT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Please Enter width ");
        int wid = input.nextInt();
        System.out.println();

        int area = len * wid;
        int perim = 2 * len + 2* wid;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perim);
    }
}
/*
Please enter length 10

Please Enter width 10

Area = 100
Perimeter = 40

 */