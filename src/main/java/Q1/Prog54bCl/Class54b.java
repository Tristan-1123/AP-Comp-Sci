package Q1.Prog54bCl;

public class Class54b {
    private int mynum1;
    private int mynum2;
    private int mynum3;
    private int mynum4;
    private int mynumT;
    private double mynumA;

    public Class54b(int num1,int num2,int num3,int num4){
          mynum1 = num1;
          mynum2 = num2;
          mynum3= num3;
          mynum4= num4;
          mynumT=0;
          mynumA=0;

    }
    public void calc(){
         mynumT=mynum1+mynum2+mynum3+mynum4;
         mynumA = mynumT/4;
    }
    public int getSum(){return mynumT;}
    public double getAv(){return mynumA;}
    public String toString() {

        return "Sum of the numbers: "+ mynumT+"\n" + " Average of Numbers: "+mynumA;
    }



}
