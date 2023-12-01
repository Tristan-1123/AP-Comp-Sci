package Q2.Prog410tCl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog410t {
    public static void main(String[] args) {
        try{
            Scanner input1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner input2 = new Scanner(new File("Langdat/survey2.dat"));
            System.out.println("ID" +"\t"+"INCOME " +"\t"+ "MEMBERS");
            int povs=0;
            int[] ids = new int[75];
            int[] incomes = new int[75];
            int[] fams = new int[75];
            int count = 0;
            int sum = 0;
            while (input1.hasNext()){
                int juh = input1.nextInt();
                int zuh = input1.nextInt();
                int quh = input1.nextInt();
                ids[count]=juh;
                incomes[count]=zuh;
                fams[count]=quh;
                count++;
            }
            while (input2.hasNext()){
                int juh = input2.nextInt();
                int zuh = input2.nextInt();
                int quh = input2.nextInt();
                ids[count]=juh;
                incomes[count]=zuh;
                fams[count]=quh;
                count++;
            }
            for(int lcv = 0; lcv<count; lcv++){
                System.out.println(ids[lcv] + " " + incomes[lcv] + " " + fams[lcv]);
            }

            for(int lcv = 0; lcv<count; lcv++){
                sum += incomes[lcv];
            }
            double aver_inco = sum/count;

            for (int lcv = 0; lcv<count; lcv++){
                if(incomes[lcv] < 3750.00 + 750.00*(fams[lcv] - 2)){
                    povs++;
                }

            }
            System.out.println("ID" +"\t"+"INCOME " +"\t"+ "MEMBERS (Families above average income)");
            System.out.println("The Average income is :" + aver_inco);
            for (int lcv = 0; lcv<count; lcv++){
                Cl410t nu = new Cl410t(incomes[lcv], fams[lcv], ids[lcv], aver_inco);
                nu.rich();

            }
            double numbo_jumbo = count/povs;
            System.out.println("The percentage of families in poverty is %" + numbo_jumbo);

        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");

}}}
