package Sumit;
import java.util.Scanner;
public class Facto {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value");
       int n=sc.nextInt();
       int f=1,i=1;
       while(i<=n)
       {
            f*=i;
            i++;
       }
       System.out.println("The factorial of "+n+" is "+f);
    }
}
