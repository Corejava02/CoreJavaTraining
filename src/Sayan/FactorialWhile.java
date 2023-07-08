import java.util.*;

public class FactorialWhile
{
    public static void main(String[]args)
    {
        int i=1, fact=1, num;
        Scanner fn = new Scanner(System.in);
        
        System.out.println("Enter The Number = ");
        num = fn.nextInt();
        
        while(i<=num)
        {
            fact = (fact * i);
            i++;
        }
        System.out.println("Factorial of "+num+"="+fact);
    }
}