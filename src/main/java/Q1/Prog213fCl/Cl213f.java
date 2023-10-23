package Q1.Prog213fCl;

public class Cl213f {
    private int h;
    private double rate;
    private double cash;
    public Cl213f (int hours){
        h= hours;
        rate = 0;
        cash=0;
    }
    public void calc(){
        if(h<=2000){
            rate = 0.07;
        }
        else if (h>2000 && h<=10000){
            rate = 0.05;
        }
        else if (h>10000) rate = 0.04;
        cash = rate*h;
    }
    public String toString(){
        return "The cost of " + h +" hours of electricity is $"+ cash;
    }

}
