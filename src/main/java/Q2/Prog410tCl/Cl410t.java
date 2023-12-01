package Q2.Prog410tCl;

public class Cl410t {
    private int inco;
    private int fam;
    private int idsd;
    private double av_in;

    public Cl410t(int income, int members, int idid, double av_income){
        inco = income;
         fam = members;
         idsd = idid;
         av_in = av_income;

    }
    public void rich(){
        if (inco>av_in){
            System.out.println(idsd + " "+ inco + " " + fam);
        }
    }


}
