package Sumit;

import java.util.Scanner;

public class EvenDiv {
    int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    int gcd(int a,int b)
    {
        while(b!=0)
        {
            int c=b;
            b=a%b;
            a=c;
        }
        return a;
    }
    int generate(int n)
    {
        int s=1;
        for(int i=1;i<=n;i++)
        {
            s=lcm(s,i);
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        EvenDiv ob=new EvenDiv();
        int s=ob.generate(n);
        System.out.println(s);
    }
}
