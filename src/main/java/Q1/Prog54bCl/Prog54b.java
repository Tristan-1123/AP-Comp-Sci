package Q1.Prog54bCl;
import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int ");
        int num1 = input.nextInt();
        System.out.println("Enter int ");
        int num2 = input.nextInt();
        System.out.println("Enter int ");
        int num3 = input.nextInt();
        System.out.println("Enter int ");
        int num4 = input.nextInt();
        Class54b ret = new Class54b(num1,num2,num3,num4);
        ret.calc();
        System.out.println(ret.toString());
    }

}
