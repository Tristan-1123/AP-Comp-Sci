package Q1.Prog209a;

public class Prog209Cl {
    private int less;
    private int more;
    private int numson;

    public Prog209Cl(int num){
        numson=num;
        less=0;
        more=0;
    }
    public void calc(){
        if(numson<500)less+=1;
        else more+=1;
    }
    public String toString(){
        return "Numbers less than 500: "+ less + "numbers equal to or greater than 500: "+ more;
    }

}
