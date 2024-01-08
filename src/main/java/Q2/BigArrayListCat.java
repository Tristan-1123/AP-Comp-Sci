package Q2;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class BigArrayListCat {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++){
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name,weight,age,cost));
            }

            System.out.println("1.All the cats");
            System.out.println("Name\tWeight\tage\tcost");

            cats.add(1,new Cat("angel", 3.6, 1,25.99));//#5
            cats.add(new Cat("gimpy", 14.3,10,29.99));

            Cat third = cats.get(2);
            cats.set(2,new Cat("sugar", 23.6, 7, 33.25));
            cats.add(third);

            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3,temp);

            System.out.println("The current cat names are: ");
            for(Cat c : cats)
                System.out.println(c.getName()+ "\t");
            System.out.println();

            System.out.println("\n The cats being put on a diet are... ");
            for(int lcv = 0; lcv < cats.size(); lcv++){
                 Cat cat = cats.get(lcv);
                 if(cat.getWeight() > 15)
                     System.out.println(cat.getName()+ "\t");
            }
            System.out.println();
            for (int lcv = 0 ; lcv<cats.size();lcv++){
                if (cats.get(lcv).getCost()<26){
                    cats.remove(lcv);
                    lcv--;
                }
            }
            System.out.println("\n 11. The Cost of the remaining cats are:");
            for(Cat c : cats)
                System.out.println(c.getCost() + " ");
            System.out.println();


        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");}}
}
