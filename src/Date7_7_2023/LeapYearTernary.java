import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        String s;
        System.out.println("Enter year:");
        year=sc.nextInt();
        s=(year % 4 == 0) && (year % 100 != 0) ||
                (year % 400 == 0)?"Leap Year":"Not Leap Year";
        System.out.println(s);
    }
}
