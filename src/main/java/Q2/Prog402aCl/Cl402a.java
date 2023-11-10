package Q2.Prog402aCl;

public class Cl402a {
    private int id;
    private int sco;
    private double diff;
    private double av;



    public Cl402a (int identification, int score,double average){
        id = identification;
        sco = score;
        av = average;
    }
    public void calc(){
        diff = sco-av;
    }
    public String toString(){
        return id + "\t" + sco + "\t" + Math.round(diff * 100.0) / 100.0;
    }
}
