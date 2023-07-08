import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Divide5 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner dd = new Scanner(System.in);

        System.out.println("Enter The Number = ");
        num = dd.nextInt();
        if (num % 5 == 0) 
        {
            System.out.println("This Number is divided by 5.");
        }
        else
        {
            System.out.println("This Number is not divided by 5.");
        }
    }
}
