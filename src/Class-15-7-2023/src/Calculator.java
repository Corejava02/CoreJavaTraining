import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        int c = calculator1.add(a, b);
        System.out.println(c);
        int d = calculator1.substract(a, b);
        System.out.println(d);
        int e = calculator1.multiply(a, b);
        System.out.println(e);
        int f = calculator1.divide(a, b);
        System.out.println(f);

    }
}

class Calculator1 {
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public int substract(int a, int b) {
        int c = a - b;
        return c;
    }

    public int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public int divide(int a, int b) {
        int c = a / b;
        return c;
    }

}
