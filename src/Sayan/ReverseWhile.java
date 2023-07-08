import java.util.*;

public class ReverseWhile
{
    public static void main(String[]args)
    {
        int i=1, num, rev=0, rem;
        Scanner rn = new Scanner(System.in);
        
        System.out.println("Enter The Number = ");
        num = rn.nextInt();
        
        while(num!=0)
        {
             rem = (num % 10);
             rev = ((rev * 10) + rem);
             num = (num / 10);
             i++;
        }
        System.out.println("The Reverse Number of The Given Number = "+rev);
    }
}