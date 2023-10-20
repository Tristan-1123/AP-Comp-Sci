package Q1.Prog213e;

public class Prog213eCl {
    private int age;
    private int age1;
    private int age2;
    private int age3;
    private int age4;
    private int age5;

    public Prog213eCl(int ageinput){
        age = ageinput;
        age1=0;
        age2=0;
        age3=0;
        age4=0;
        age5=0;
    }
    public void calc(){
        if (age<20) age1++;
        else if (age >= 20 && age<=39) age2++;
        else if (age >= 40 && age<=59) age3++;
        else if (age >= 60 && age<=79) age4++;
        else if (age>=80) age5++;
    }

    public int getAge1(){return age1;}
    public int getAge2(){return age2;}
    public int getAge3(){return age3;}
    public int getAge4(){return age4;}
    public int getAge5(){return age5;}
}
