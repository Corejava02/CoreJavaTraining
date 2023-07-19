import java.util.Scanner;

public class Pattern2 
{
    public static void main(String args[])
    {
        int val;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of pattern to be printed = ");
        val = sc.nextInt();

        System.out.println("Pattern ----- ");
        for(int i=val; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
