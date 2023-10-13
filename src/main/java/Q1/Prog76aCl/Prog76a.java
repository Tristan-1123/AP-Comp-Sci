package Q1.Prog76aCl;
import java.util.*;
public class Prog76a {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Cl76a dog = new Cl76a(num);
        dog.calc();
        System.out.println(dog);
    }
}
