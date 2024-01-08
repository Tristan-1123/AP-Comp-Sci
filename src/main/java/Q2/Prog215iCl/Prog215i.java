package Q2.Prog215iCl;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog215i {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog215i.dat"));
            ArrayList<Cl215i> car_fleet = new ArrayList<>();
            double[] mpgs = new double[20];
            int count= 0;
            while (input.hasNext()){
                int car_numb = input.nextInt();
                double mil= input.nextDouble();
                double gals = input.nextDouble();
                Cl215i car = new Cl215i(car_numb,mil,gals);
                car_fleet.add(car);
                mpgs[count]= mil/gals;
                count++;
            }
            System.out.println("Car \t Miles \t Gallons \t MPG" );
            for(int lcv=0; lcv<count; lcv++){
                System.out.println(car_fleet.get(0));
            }
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");}}
}
