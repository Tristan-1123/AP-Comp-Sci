package Q1;
import java.util.*;
public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter package length");
        int len = input.nextInt();
        System.out.println("Enter package width");
        int wid = input.nextInt();
        System.out.println("Enter package height");
        int hei = input.nextInt();
        System.out.println("Enter package weight");
        int weight = input.nextInt();
        int size = len*wid*hei;
        boolean fin = false;
        if (weight>27 && size>100000){
            System.out.println("Too heavy and too large.");
            fin = true;;
        }
        if(weight>27 && !fin==true) System.out.println("Too heavy.");

        if(size>100000 && !fin==true) System.out.println("Too large.");

        if(!fin==true) System.out.println("ok.");


    }
}
