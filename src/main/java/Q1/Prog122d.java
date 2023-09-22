package Q1;

public class Prog122d {
    public static void main(String[] args) {
        int lcv = -13;
        while(lcv<16){
            lcv++;
           double y = Math.pow(lcv,6) -(3*Math.pow(lcv,5)) - (93*Math.pow(lcv,4))+(87*Math.pow(lcv,3))
                   +(1596*Math.pow(lcv,2)) - (1380*lcv)- 2800;
           System.out.println(lcv + " " + y);
        }
    }
}
