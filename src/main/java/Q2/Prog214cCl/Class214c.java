package Q2.Prog214cCl;

public class Class214c {
    private double gallons;
    private String wash;

    private double reg ;
    private double prem ;
    private double octane ;

    private double gas_cost;
    private double wash_cost;

    public Class214c(double gals, String wasso){
        gallons = gals;
        wash = wasso;
    }

    public void calc(){
        reg = 1.359;
        prem = 1.479;
        octane = 1.429;
        if(wash.equals("N")) wash_cost=0;
        else if(gallons>=20)wash_cost=0;


    }


}
