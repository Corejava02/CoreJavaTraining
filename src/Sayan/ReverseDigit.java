import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        int num, i=1, rem, c=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number = ");
        num = sc.nextInt();

        while(num!=0)
        {
            rem = num % 10;
            System.out.println("The Digit at Position "+c+" = "+rem);
            
            c--;
        }
    }
}
