package Q1.Prog209a;

public class Prog209Cl {
    private int less;
    private int more;
    private int input;

    public Prog209Cl(int num){
        input=num;
        less=0;
        more=0;
    }
    private void calc(){
        if(input<500)less+=1;
        else more+=1;
    }
    public void amek(){
        calc();
    }
    public int getLess(){return less;}
    public int getMore(){return more;}

}
