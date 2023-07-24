package Sumit;

import java.util.Scanner;

 class Operate {
    public int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b)
    {
        int dif=0;
        if(a>b)
        dif=a-b;
        else
        dif=b-a;
        return dif;
    }
    public int multi(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public int div(int a,int b)
    {
        int d=0;
        if(a>b)
        d=a/b;
        else
        d=b/a;
        return d;
    }
    public int mod(int a,int b)
    {
        int d=0;
        if(a>b)
        d=a%b;
        else
        d=b%a;
        return d;
    }
}
    public class Calc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        Operate ob=new Operate();
        System.out.println("Sum:"+ob.add(a,b));
        System.out.println("Difference:"+ob.sub(a,b));
        System.out.println("Product:"+ob.multi(a,b));
        System.out.println("Quotient:"+ob.div(a,b));
        System.out.println("Remainder:"+ob.mod(a,b));
    }
}
