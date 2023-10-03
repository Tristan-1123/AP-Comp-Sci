package Q1.Prog52aCL;
import  java.util.*;

public class Prog52Cl {//Driver Class(Main)
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length");
        int l = input.nextInt();
        System.out.print("Enter Width");
        int w = input.nextInt();

        //Calculation Section
        Cl52a wow = new Cl52a(l,w );
        wow.calc();// Don't forget to call calc or setThing!

        int area = wow.getArea();
        int perim = wow.getPerim();

        // Output section
        System.out.println("area: " + area);
        System.out.println("Perim: " + perim);
    }
}
