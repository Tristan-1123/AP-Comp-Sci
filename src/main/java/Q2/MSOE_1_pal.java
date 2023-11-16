package Q2;
import java.util.*;

public class MSOE_1_pal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        String emp = "";
        for (int lcv =0; lcv < str.length(); lcv++){
            emp += str.substring(lcv,lcv+1);
        }
        if (str.equals(emp)) System.out.println("True");
        else System.out.println("no");
    }
}
