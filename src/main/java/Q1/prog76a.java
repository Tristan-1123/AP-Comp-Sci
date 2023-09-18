package Q1;
import java.util.*;
public class prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1-9 ");
        int num = input.nextInt();
        int numdis = (num*9);
        int numdislike = (numdis*12345679);

        System.out.println(num);
        System.out.println("x 9");
        System.out.println("_______________");
        System.out.println(numdis);
        System.out.println("x 12345679");
        System.out.println("_______________");
        System.out.println(numdislike + " Surprise!");




    }

}
