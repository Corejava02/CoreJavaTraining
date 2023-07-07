package Sumit;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number till which prime numbers to be generated:");
       int lst=sc.nextInt();
       int fst=1,i=2,c=0;
       System.out.println("Prime numbers are:");
       while(fst<=lst)
       {
        while(i<=fst){
            if(fst%i==0)
        {
            c+=1;
        }
        i+=1;
        }
        if(c==1)
        {
            System.out.println(fst);
            c=0;
        }
        else{
            c=0;
        }
        fst+=1;
        i=2;
    }
    }
    
}
