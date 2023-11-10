package Q2.Prog402aCl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog402a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prg402a.dat"));
            int [] list1 = new int[30];
            int [] list2 = new int[30];
            int count = 0;
            double avo =0;
            while (input.hasNext()){
                list1[count] = input.nextInt();
                list2[count] = input.nextInt();
                count ++;
            }
            for(int lcv = 0; lcv <count; lcv++ ){
                avo += list2[lcv];
            }
            avo /= count;
            for(int lcv = 0; lcv<count; lcv++){
                Cl402a finner = new Cl402a(list1[lcv], list2[lcv], avo);
                finner.calc();
                System.out.println(finner.toString());
            }
            System.out.printf("The average is: %.2f\n",avo);

            }
        catch (IOException e) {
            System.out.println("Can't find Data File!");

}}}
