package Q1.Prog209a;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog209a {
    public static void main(String[] args) {
        int num =0;
        int mo =0;
        int le =0;
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.txt"));
            while (input.hasNext()) {
                num= input.nextInt();
                Prog209Cl res = new Prog209Cl(num);
                res.amek();
                 mo += res.getMore();
                 le += res.getLess();
            }
            System.out.println("More than 500: " + mo + "\n Less than: "+ le);

        } catch (IOException e) {
            System.out.println("Can't find Data File!");
        }
    }}