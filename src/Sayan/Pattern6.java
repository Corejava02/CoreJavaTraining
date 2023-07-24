import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[])
    {
        int num, temp=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Pattern = ");
        num = sc.nextInt();

        for(int i=1; i<num+1; i++)
        {
            for(int j=0; j<i; j++)
            {
                temp += 1;
                System.out.print(" "+temp);
            }
            System.out.println();
        }
    }
}
