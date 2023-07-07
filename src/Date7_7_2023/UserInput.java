import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        a=scanner.nextInt();
        System.out.println(++a);
    }
}
