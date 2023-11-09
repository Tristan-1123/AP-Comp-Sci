package Q2.Prog435aCl;

public class Cl435a {
    private int car;
    private int ga;
    private double type;
    private String car_type;
    private double toll;

    public Cl435a(int vehicle, int gate){
        car = vehicle;
        ga = gate;
        type = 0;
        car_type = "";
        toll = 0;
    }
    public void calc(){
        if (car == 1){
            type =1;
            car_type= "Compact Car";
        }
        else if (car == 2) {
            type = 1.3;
            car_type= "Small Car";
        }
        else if (car == 3){
            type = 1.6;
            car_type="Mid Size Car";
        }
        else if(car == 4){
            type = 2;
            car_type = "Full Size Car";
        }
        else if(car ==5) {
            type=2.4;
            car_type = "Truck";
        }
        else if (car == 6){
            type =2.7;
            car_type ="16 Wheeler";
        }

        if (ga ==1) toll = 1.35;
        else if (ga == 2) toll = 2;
        else if (ga == 3) toll = 2.5;
        else if (ga == 4) toll = 3.25;
        else if (ga == 5) toll = 4.1;
        else if (ga == 6) toll = 4.8;
        else if (ga == 7) toll = 5.5;
        else if (ga == 8) toll = 6;
    }
    public String toString() {return car_type +" "+ toll + " "+ type + " "+ "$" + (toll*type);}
}
