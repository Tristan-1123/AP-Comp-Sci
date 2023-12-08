package Q2.Prog214cCl;

public class Class214c {
    private String g_t;
    private double gallons;
    private String wash;

    private double reg ;
    private double prem ;
    private double octane ;

    private double gas_cost;
    private double wash_cost;
    private double gas_rate;

    public Class214c(double gals, String wasso, String gasso_Typo){
        g_t = gasso_Typo;
        gallons = gals;
        wash = wasso;
    }

    public void calco(){
        reg = 1.359;
        prem = 1.479;
        octane = 1.429;

        wash_cost=2;
        if(wash.equals("N")) wash_cost=0;
        else if(!(gallons>=20) && gallons>10 )wash_cost = wash_cost * (1-(0.1*(gallons/10)));
        else if (gallons>=20)wash_cost=0;
        else if (gallons<=10)wash_cost = 2;

        if(g_t.equals("R")){
            gas_cost= gallons*reg;
            g_t="Regular";
            gas_rate = reg;
        }
        else if(g_t.equals("P")){
            gas_cost= gallons*prem;
            g_t="Premium";
            gas_rate = prem;
        }
        else if(g_t.equals("H")){
            gas_cost= gallons*octane;
            g_t="Octane";
            gas_rate = octane;
        }


    }
    public String toString(){
        return "Comp Sci petrol"+ "\n"+ "______________________________"+ "\n" +g_t +"\t" + gallons +" @ "+  gas_rate
                + "\n" + "______________________________"+"\n" +"gas" + "\t"+ gas_cost + "\n"+ "wash"+ "\t"+ wash_cost
                + "\n"+ "Total due: " + (wash_cost+gas_cost)+ "\n\n";
    }


}
