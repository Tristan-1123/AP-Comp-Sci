package Q1.Cl88a;

public class Cl88a {
    private int num1;
    private int num2;
    private int sum;
    private int diff;
    private int pro;
    private int ave;
    private int diss;
    private int max;
    private int min;

    public Cl88a(int numy, int numg){
        num1 = numy;
        num2 = numg;
        sum = 0;
        diff = 0;
        pro = 0;
        ave = 0;
        diss = 0;
        max = 0;
        min = 0;

    }
    public void calc(){
        sum = num1 + num2;
        diff = num1 - num2;
        pro = num1 * num2;
        ave = (num1 + num2)/2;
        diss = Math.abs(diff);
        if (num1 < num2) {
            max = num2;
            min = num1;
        }
        else{
            max = num1;
            min = num2;
        }
    }
    public String toString(){
        return "sum: "+sum+ "\n"+ "differance: "+diff+ "\n" + "product: "+pro+ "\n"
                + "average: "+ave+ "\n" + "distance: "+diss+ "\n" + "Max: "+ max+ "\n" + "min: "+min;
    }
}

