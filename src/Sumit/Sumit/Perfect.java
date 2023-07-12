package Sumit;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        int dup=n,sum=0;
        int f=1;
        while(f<n)
        {
            if(n%f==0)
            {
                sum=sum+f;
                
            }
            f+=1;
        }
        if(dup==sum)
        {
            System.out.println(dup+" is a perfect number.");
        }
        else{
            System.out.println(dup+" is not a perfect number.");
        }
    }
}
