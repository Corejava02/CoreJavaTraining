package Sumit;

import java.util.Scanner;

public class Maxnum {
    public int max(int n1,int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else{
            return n2;
        }
    }
    public double max(double n1,double n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args) {
        int max1;
        double max2;
        Maxnum ob=new Maxnum();
        max1=ob.max(10,51);
        max2=ob.max(10.2,51.3);
        System.out.println("Maximum number between two integers is:"+max1);
        System.out.println("Maximum number between two double values is:"+max2);
    }
}
