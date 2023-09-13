package Q1;
import java.util.*;

public class GradeCalc {
    public static void main(String[] args) {
        //input section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade as a percent");
        double gp = input.nextDouble();

        //calc section
        String grade = "";
        if (gp >= 90) grade = "a";
        else if(gp >= 80) grade = "b";
        else if(gp >= 70) grade = "c";
        else if(gp >= 60) grade = "d";
        else grade = "f";

        // output sectionS
        System.out.println("your grade is a(n) " + grade);
    }
}
