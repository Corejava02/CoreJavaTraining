package Subham;
import java.util.Scanner;
class LeapYear2 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4==0 && year % 100 !=0) || (year % 400 == 0);
        String Result  = isLeapYear ? "Leap Year" : "Not a Leap Year";
        System.out.println(Result);

    }
}