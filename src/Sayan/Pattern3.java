import java.util.Scanner;

public class Pattern3 
{
    public static void main(String args[])
    {
        int num, temp, x=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number of Pattern = ");
        num = sc.nextInt();

        temp = ((2 * num) - 2);

        for(int i=0; i<num; i++)
        {
            x += 1;
            for(int j=0; j<temp; j++)
            {
                System.out.print(" ");
            }
            temp = (temp - 1);
            for(int j=0; j<i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
