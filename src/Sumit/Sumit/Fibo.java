package Sumit;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number till which prime numbers to be generated:");
       int lst=sc.nextInt();
       System.out.println("The fibonacci series:");
       int a=0,b=1,c=0;
       int i=2;
       System.out.println(a);
       System.out.println(b);
       while(i<=lst)
       {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        i+=1;
        } 
       }
    }
    

