package Q1.Prog93aCl;

public class CL93a {
    private int kwh;
    private double baseRate;
    private double surcharge;
    private double cityTax;
    private double totalAmount;
    private double lateTotalAmount;

    public CL93a(int mykwh) {
        kwh = mykwh;
        baseRate = 0;
        surcharge =0;
        cityTax =0;
        totalAmount =0;
        lateTotalAmount =0;


    }
    public void calc(){
        baseRate = kwh * 0.0475;
        surcharge = baseRate * 0.1;
        cityTax = baseRate * 0.03;
        totalAmount = baseRate+surcharge+cityTax;
        lateTotalAmount = totalAmount+(totalAmount*0.04);
    }

    public double getBaseCharge() {return baseRate;}
    public double getSurcharge() {return surcharge;}
    public double getCitytax() {return cityTax;}
    public double gettotalAmount() {return totalAmount;}
    public double getLateTotalAmount() {return lateTotalAmount;}
    public String toString() {

        return "Amount due: "+ totalAmount+"\n" + " Amount due if late: "+lateTotalAmount;
    }
}


