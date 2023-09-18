package Q1;

public class Prog122a {
    public static void main(String[] args) {
        System.out.println("Number   Square   Square Root");
        int lcv = 0;
        while (lcv<50){
            lcv += 1;
            int Square = lcv*lcv;
            double Root = Math.sqrt(lcv);
            System.out.printf(lcv + "        " +Square+ "           %.4f\n", Root);
        }

    }
}
