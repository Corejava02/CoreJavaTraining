import java.util.Scanner;

public class heightcalc {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height value in centimeters:");
    int ce=sc.nextInt();
    float in=(float)ce * 0.393701f;
    float fo=(float)ce * 0.0328084f;
    System.out.println("Your height in feets:"+fo);
    System.out.println("Your height in inches:"+in);
   } 
}
