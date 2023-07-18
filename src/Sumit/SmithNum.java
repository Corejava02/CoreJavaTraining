package Sumit;
import java.util.Scanner;

public class SmithNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int dup=num,i=1,j=1,c=0,sum1=0;
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
            System.out.println(i);
            sum1=sum1+i;
            c=0;
        }
        else{
            c=0;
        }
        }
        i+=1;
        j=2;
    }
    System.out.println(sum1);
    }
}
