package Q2.Prog214bCl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog214b {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog214b.txt"));
            int [] num1 = new int[100];
            double [] num2 = new double[100];
            double [] num3 = new double[100];
            double [] num4 = new double[100];
            double [] num5 = new double[100];
            int cnt=0;
            while (input.hasNext()){
                num1[cnt]= input.nextInt();
                num2[cnt]= input.nextDouble();
                num3[cnt]= input.nextDouble();
                num4[cnt]= input.nextDouble();
                num5[cnt]= input.nextDouble();
                cnt++;
            }
            for(int lcv = 0; lcv<cnt; lcv++){
                Cl214b yunn = new Cl214b(num1[lcv], num2[lcv],num3[lcv],num4[lcv],num5[lcv]);
                yunn.calc();
                System.out.println("\n"+"\n");
                System.out.println(yunn);
            }
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
        }}}