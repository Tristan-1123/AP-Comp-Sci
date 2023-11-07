package Q2.Prog213f;
import Q2.Prog213f.Cl213far;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog213fArray {
    public static void main(String[] args) {
        try{
            Cl213far[] list = new Cl213far[1000];
            int cnt = 0;
            Scanner input = new Scanner(new File("Langdat/prog213f.txt"));
            while (input.hasNext()){
                int kwh = input.nextInt();
                if (kwh != -999){
                    Cl213far yikes = new Cl213far(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }

                }
            for (int lcv = 0; lcv<cnt; lcv++)
                list[lcv].calc();
            for (int lcv = 0; lcv<cnt; lcv++)
                System.out.println(list[lcv]);
        }
        catch(IOException e) {
            System.out.println("Can't find Data File!");
        }
    }}


