package Q1;

import java.util.Scanner;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Time 1 ");
        int time1 = input.nextInt();
        System.out.print("Please Time 2 ");
        int time2 = input.nextInt();
        int time = 0;
        int hours = 0;
        int mins = 0;

        if(time1 > time2){
            time = time1 - time2;
            hours = time / 100;
            mins = (time % 100) /1;
            System.out.println("The time between the two is " + hours + " hours and " + mins + " minutes" );
        }
        if(time2 > time1){
            time = time2 - time1;
            hours = time / 100;
            mins = (time % 100) /1;
            System.out.println("The time between the two is " + hours + " hours and " + mins + " minutes" );
        }
        else System.out.println("0 minutes, 0 hours" );




    }
}
