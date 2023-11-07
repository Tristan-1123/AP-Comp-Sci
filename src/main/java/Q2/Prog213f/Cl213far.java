package Q2.Prog213f;

public class Cl213far {
    private double h;
    private double cash;
    public Cl213far (double hours){
        h = hours;
        cash=0;
    }
    public void calc(){
        if(h<=2000 && h>0){
            cash = 0.07*h;
        }
        else if (h>2000 && h<=10000){
            cash+= 2000*0.07;
            h -= 2000;
            cash += 0.05*h;
        }
        else if (h>10000) {
            cash+= 2000*0.07;
            h -= 2000;
            cash += 0.05*8000;
            h-=8000;
            cash += h*0.04;

        }
    }
    public String toString(){
        return "The cost of " + h +" hours of electricity is $"+ cash;
    }
}
