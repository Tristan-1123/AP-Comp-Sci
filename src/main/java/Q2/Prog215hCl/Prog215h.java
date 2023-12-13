package Q2.Prog215hCl;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog215h {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog215h.txt"));
            //ArrayList<Class214c> list = new ArrayList<Class214c>();
            ArrayList con1= new ArrayList();
            double[] cono = new double[9];
            int lcv_in = 0;
            while (input.hasNext()){
                double score= input.nextDouble();
                for(int lcv =0; lcv<8; lcv++){
                    cono[lcv] = score;
                    if(lcv==7){
                        con1.add(cono);
                        lcv = 0;
                        break;
                    }
                }
                }
        }
        catch (IOException e) {
        System.out.println("Can't find Data File!");}
}}
