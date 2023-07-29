package Sumit;

import java.util.Scanner;

public class calArea {
    public double area(double r)
    {
        double pi=3.14;
        double a=pi*r*r;
        return a;
    }
    public double area(double l,double b)
    {
        double a=l*b;
        return a;
    }
    public double area(double a,double b, double c)
    {
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    public static void main(String[] args) {
        int i=0;
        double area;
        calArea ob=new calArea();
        while(i!=1)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 to find area of circle, 2 to find area of rectangle, 3 to find area of triangle and 4 to terminate...");
            int key=sc.nextInt();
            switch (key) {
                case 1:
                System.out.println("Enter radius of circle in cm:");
                    double r=sc.nextDouble();
                     area=ob.area(r);
                    System.out.println("Area of circle is:"+area+"sq.cm");
                    break;
                    case 2:
                    System.out.println("Enter length of rectangle in cm:");
                    double l=sc.nextDouble();
                    System.out.println("Enter breadth of rectangle in cm:");
                    double br=sc.nextDouble();
                    area=ob.area(l,br);
                    System.out.println("Area of rectangle is:"+area+"sq.cm");
                    break;
                    case 3:
                    System.out.println("Enter first side of the triangle in cm:");
                    double a=sc.nextDouble();
                    System.out.println("Enter second side of the triangle in cm:");
                    double b=sc.nextDouble();
                    System.out.println("Enter third side of the triangle in cm:");
                    double c=sc.nextDouble();
                    area=ob.area(a,b,c);
                    System.out.println("Area of triangle is:"+area+"sq.cm");
                    break;
                default:
                i=1;
                System.out.println("TERMINATED...");
                    break;
            }
        }
    }
}
