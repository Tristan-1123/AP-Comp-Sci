package Q2.Prog435aCl;
import Q2.Prog435gCl.Cl435g;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog435a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            int [] list1 = new int[20];
            int [] list2 = new int[20];
            int count = 0;

            while (input.hasNext()){
                int num = input.nextInt();
                int num2 =input.nextInt();
                list1[count] = num;
                list2[count] = num2;
                count++;
            }
            for (int lcv = 0; lcv < count; lcv++) {
                Cl435a fin = new Cl435a(list1[lcv], list2[lcv]);
                fin.calc();
                System.out.println(fin.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
}}}
