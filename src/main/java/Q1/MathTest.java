package Q1;

public class MathTest {
    public static void main(String[] args){
        int twocubed = (int)Math.pow(2,3); //2^3

        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int num4 = 5;
        int sum = num1 + num2 + num3 + num4;
        sum /= 4; // sum = sum / 4

        num1 = num1 + 1;
        num1 += 1;
        num1++;

        // arith opps + - * / %
        //  assignment opps= += -= *= /= %= ++ --
        int test = 3/4;
        System.out.println(test);

        double myWallet = 1231.1321123312;
        double myWrounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWrounded);
        System.out.printf("myWrounded = %.2f\n", myWallet ); // %.#f # = number rounded up to

    }
}
