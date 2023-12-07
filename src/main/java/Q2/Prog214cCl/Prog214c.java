package Q2.Prog214cCl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog214c {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Class214c> list = new ArrayList<Class214c>();
            while (input.hasNext()){
                String wer = input.next();
                double gallo = input.nextDouble();
                String aff= input.next();
                Class214c addo = new Class214c(gallo,aff,wer);
                list.add(addo);
            }
            for (int lcv = 0; lcv<list.size(); lcv++){
                Class214c stuf = list.get(lcv);
                stuf.calco();
                System.out.println(stuf.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
}}}
