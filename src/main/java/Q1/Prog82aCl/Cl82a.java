package Q1.Prog82aCl;

public class Cl82a {
    private int speed;
    private int limit;
    private double fine;

    public Cl82a(int sp, int lim){
        speed = sp;
        limit = lim;
        fine = 0;

    }
    public void cal(){
        if(limit>=speed) fine = 0;
        else fine = ((speed-limit)*5) +20;

    }
    public double getFine(){return fine;}

    public String toString(){
        return String.format("You earned a fine of: $%.2f", fine);
    }
}
