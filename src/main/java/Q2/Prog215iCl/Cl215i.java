package Q2.Prog215iCl;

public class Cl215i {
    private int car_num;
    private double miles;
    private double gallons;

    public Cl215i(int carnum, double miless, double galls){
        car_num = carnum;
        miles=miless;
        gallons=galls;
    }
    public String toString(){
        return  car_num +"\t" + miles +"\t"+ gallons;
    }



}
