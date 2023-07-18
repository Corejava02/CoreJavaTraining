import java.util.*;

class PerfectNumberWhile
{
    public static void main (String[]args)
    {
        int num, i=1, sum=0;
        Scanner pn=new Scanner (System.in);
        
        System.out.println ("Enter the Number = ");
        num=pn.nextInt();
        
        while(i<=num/2)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if (sum==num)
        {
            System.out.println (num+" is a perfect number.");
        }
        else
        {
            System.out.println (num+" is not a perfect number.");
        }
    }
}