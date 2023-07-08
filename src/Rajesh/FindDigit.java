import java.util.Scanner;

public class FindDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        int inputSize = Integer.toString(input).length();
        while (input != 0) {
            int digit = input % 10;
            System.out.println("Digit" + (inputSize) + ": " + digit);
            inputSize--;
            input /= 10;
        }
        /*
            3456
            input = 0
            input%10 = 6
         */
    }
}
