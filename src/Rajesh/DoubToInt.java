import java.util.Scanner;

public class DoubToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a double value:");
        double d=sc.nextDouble();
        int i=0;
        if(d<Integer.MIN_VALUE || d>Integer.MAX_VALUE)
        {
            System.out.println("Error: Potential loss of data. Cannot convert to int.");
            
        }
            i=(int)d;
            if(i!=d)
            {
                System.out.println("Warning: Conversion resulted in loss of decimal places.");
            }
            else{
                System.out.println("The value in integer:"+i);
            }
        

    }
}
