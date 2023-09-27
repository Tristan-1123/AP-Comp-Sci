package Q1;
import java.util.*;
public class Strint7 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String mytext = cool.nextLine().toLowerCase().trim();

        int vcount = 0;
        int ccount = 0;
        for (int lcv = 0; lcv<mytext.length();lcv++){
            char cur = mytext.charAt(lcv);
            if(cur == 'a' || cur == 'e' || cur == 'i'|| cur=='o'||cur=='u')vcount++;
            else if (cur != ' ')ccount++;

        }
        System.out.printf("# Vowels: %d\t\t# Consonanats: %d\n", vcount,ccount);
    }
}
