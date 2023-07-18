package Sumit.Sumit;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i!=1)
        {
            System.out.println("Enter + to add, - to subtract , * to multiply, / to divide and c to cancel:");
            String c=sc.next();
            int a,b=0;
            switch(c)
            {
                case "+":
                System.out.println("Enter first number:");
                a=sc.nextInt();
                System.out.println("Enter second number:");
                b=sc.nextInt();
                int sum=a+b;
                System.out.println("SUM:"+sum);
                break;
                case "-":
                System.out.println("Enter first number:");
                a=sc.nextInt();
                System.out.println("Enter second number:");
                b=sc.nextInt();
                int sub=a-b;
                System.out.println("DIFFERENCE:"+sub);
                break;
                case "*":
                System.out.println("Enter first number:");
                a=sc.nextInt();
                System.out.println("Enter second number:");
                b=sc.nextInt();
                int mul=a*b;
                System.out.println("PRODUCT:"+mul);
                break;
                case "/":
                System.out.println("Enter first number:");
                a=sc.nextInt();
                System.out.println("Enter second number:");
                b=sc.nextInt();
                int div=a/b;
                System.out.println("QUOTIENT:"+div);
                break;
                default:
                System.out.println("TERMINATED...");
                i=1;
                break;

            }
        }
    }
}
