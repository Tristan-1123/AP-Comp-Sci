package Q1.Prog213fCl;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog213f {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog213f.txt"));
            while (input.hasNext()){
                int hurs = input.nextInt();
                if (hurs>0){
                    Cl213f nu = new Cl213f(hurs);
                    nu.calc();
                    System.out.println(nu);
                }}
            }
        catch(IOException e) {
            System.out.println("Can't find Data File!");
        }
            }}


