import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int fno=sc.nextInt();
        System.out.println("Enter the second no.:");
        int sno=sc.nextInt();
        fno=fno+sno;
        sno=fno-sno;
        fno=fno-sno;
        System.out.println("The first number is:"+fno);
        System.out.println("The second number is:"+sno);
    }
}
