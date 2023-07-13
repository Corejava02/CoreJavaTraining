import java.util.*;
public class ReversePalindrome
{
    public static void main (String[]args)
    {
        int i=0, num=1, rem, rev=0, temp;
        Scanner pn = new Scanner (System.in);
        
        System.out.println ("Enter The Number = ");
        num = pn.nextInt();
        
        temp = num;
        while(num!=0)
        {
            rem = (num % 10);
            rev=(rev*10) + rem;
            num = (num / 10);
            i++;
        }
        
        if(temp==rev)
        {
            System.out.println (temp+" is a Palindrome Number");
        }
        else
        {
            System.out.println (temp+" is a not Palindrome Number");
        }
    }
}