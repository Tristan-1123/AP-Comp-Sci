package Q1.Prog76aCl;

public class Cl76a {
    private int number;
    private int res;
    public Cl76a(int num){
        number = num;
        res =0;

    }
    public void calc(){
        res = number*9;
        res = res*12345679;

    }
    public int getNumber(){return res;}
    public int getRes(){return res;}

    public String toString(){
        return number +"\n" + "x 9"+ "\n\n"+ (number*9) +"\n" +"12345679" +"\n" + res;
    }
}
