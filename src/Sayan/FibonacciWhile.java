import java.util.*;

public class FibonacciWhile
{
    public static void main(String[]args)
    {
        int num1=0, num2=1, temp, num3;
        Scanner fs = new Scanner(System.in);
        
        System.out.println("Enter The End Limit = ");
        num3 = fs.nextInt();
        
        System.out.println("The Fibonacci Series is ----- ");
        System.out.println(""+num1);
        System.out.println(""+num2);
        int i=3;
        while(i<=num3)
        {
            temp=(num1+num2);
            System.out.println(""+temp);
            num1=num2;
            num2=temp;
            i++;
        }
    }
}