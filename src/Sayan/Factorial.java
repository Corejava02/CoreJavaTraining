import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        int num, fact = 1, i = 1;
        Scanner fa = new Scanner(System.in);

        System.out.println("Enter The Number = ");
        num = fa.nextInt();

        while (i <= num)
        {
            fact *= i;
            i++;
        }
        System.out.println("The Factorial of "+num+" = "+fact);
    }
}
