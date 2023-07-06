import java.util.Scanner;

public class livedayscalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age in years:");
        int age=sc.nextInt();
        System.out.println("You lived "+(age*365)+" days");
    }
}
