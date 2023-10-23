package Q1.Prog213e;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog213e {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));
            double loopcv = input.nextDouble();
            int lcv = 0;
            int num = 0;
            int num1=0;
            int num2=0;
            int num3=0;
            int num4=0;
            int num5=0;
            while (input.hasNext() & lcv<loopcv){
                num = input.nextInt();
                Prog213eCl nu = new Prog213eCl(num);
                nu.calc();
                num1 += nu.getAge1();
                num2 += nu.getAge2();
                num3 += nu.getAge3();
                num4 += nu.getAge4();
                num5 += nu.getAge5();
                lcv++;
            }
            System.out.println("<20 \t"+ num1 + "\t" + (num1/loopcv) +"%\n"+
                    "20-39 \t"+ num2 + "\t" + (num2/loopcv)+ "%\n"+
                    "40-59 \t"+ num3 + "\t" + (num3/loopcv) + "%\n"+
                    "60-79 \t" + num4 + "\t" + (num4/loopcv) + "%\n"+
                    ">80 \t" + num5 + "\t" + (num5/loopcv) + "%");
            }
        catch (IOException e) {
            System.out.println("Can't find Data File!");

    }
}}
