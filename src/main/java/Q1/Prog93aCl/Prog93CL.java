package Q1.Prog93aCl;
import java.util.*;
public class Prog93CL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KWH");
        int kwh = input.nextInt();
        CL93a ret = new CL93a(kwh);
        ret.calc();
        System.out.println(ret.toString());


    }
}
