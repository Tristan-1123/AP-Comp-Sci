package Q2.Prog435aCl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog435a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            int [] list = new int[300];
            int count = 0;

            while (input.hasNext()){
                int num = input.nextInt();
                list[count] = num;
                count++;
            }
            for (int lcv = 0; lcv < list.length; lcv++) {
                Cl435a fin = new Cl435a(list[lcv],list[lcv+1]);
                System.out.println(fin.toString());

            }
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
}}}
