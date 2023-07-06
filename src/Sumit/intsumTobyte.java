import java.util.Scanner;

public class intsumTobyte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int f=sc.nextInt();
        System.out.println("Enter the second integer:");
        int s=sc.nextInt();
        int sum=0;
        sum=f+s;
        if(sum<Byte.MIN_VALUE || sum>Byte.MAX_VALUE)
        {
            System.out.println("Error: Sum is out of the range of a byte variable.");
        }
        else{
            byte b=(byte)sum;
            System.out.println("Sum:"+b);
        }
        
       

    }
}
