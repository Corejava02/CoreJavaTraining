import java.util.*;

public class PrimeNumbersWhile
{
    public static void main(String[]args)
    {
        int num1=1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Ending Number = ");
        num2 = sc.nextInt();
        
        System.out.println("The Prime Numbers are ----- ");
        while(num1<=num2)
        {
            int i=2, c=0;
            while(i<=num1/2)
            {
                if(num1%i==0)
                {
                    c++;
                }   
            i++;
            }
        
            if (c==0 && num1!=1)
            {
                System.out.println (num1+" ");
            }
            num1++;
        }
    }
}