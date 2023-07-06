import java.util.Scanner;

public class IntToDoub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer:");
        int i=sc.nextInt();
        System.out.println("The number in integer:"+i);
        double d=(double)i;
        System.out.println("The number in double:"+d);
    }
}
