package Sumit;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number whose largest prime factor is to be generated:");
       int num=sc.nextInt();
       int i=1,j=2,c=0,max=0;
       System.out.println("Largest Prime factor is:");
       while(i<=num)
       {
        if(num%i==0)
        {
            while(j<=i){
            if(i%j==0)
        {
            c+=1;
        }
        j+=1;
        }
        if(c==1)
        {
            if(max<i)
            {
                max=i;
            }
            c=0;
        }
        else{
            c=0;
        }
        }
        i+=1;
        j=2;
    }
    System.out.println(max);
    }
    
}
