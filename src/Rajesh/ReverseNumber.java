import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        if(num<100 || num>999){
            System.out.println("This is not a three digit number");
        }
        int num3 = num%10;
        num = num/10;
        int num2 = num%10;
        num = num/10;
        int num1 = num%10;

        System.out.println("First: "+num1);
        System.out.println("Second: "+num2);
        System.out.println("Third:"+num3);

        /*
         * 123%10 = 3
         * 123/10 = 12
         *
         */
    }
}


