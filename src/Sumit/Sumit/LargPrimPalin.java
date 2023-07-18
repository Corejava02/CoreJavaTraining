package Sumit;
import java.util.Scanner;

public class LargPrimPalin {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value:");
    int n=sc.nextInt();
    int max=0,i=100,c=0;
    max=i;
    while(i<n)
    {
      int rem=0,dup=i,rev=0;
      while(dup>0)
      {
         rem=dup%10;
         rev=(rev*10)+rem;
         dup=dup/10;
      }
      if(rev==i)
      {
         int r=1;
         while(r<=i)
         {
            if(i%r==0)
            {
               c=c+1;
            }
            r+=1;
         }
         if(c==2)
         {
            c=0;
            if(max<i)
            {
               max=i;
            }
         }
         else{
            c=0;
         }
      }
      i+=1;
    }
   System.out.println("Largest palprime number within "+n+" :"+max);
   } 
}
