package Q1.Prog54cCl;

public class Cl54c {
    private int diameter;
    private double radius;
    private double area;
    private double circum;
    private double pi;

    public Cl54c(int diam){
        diameter = diam;
        radius = 0;
        area = 0;
        circum=0;
        pi = 0;
    }
    public void calc(){
        pi = 3.14159;
        radius = (double)diameter/2;
        area = pi * (radius*radius);
        circum = (pi*2)*radius;
    }
    public double getRadius(){return radius;}
    public double getArea(){return area;}
    public double getCircum(){return circum;}
    public String toString(){
        return "The radius is: "+ radius+ "\n"+ "The area is: " + area + "\n"+ "The circumference is: " + circum ;
    }
 }
