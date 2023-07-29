import java.util.*;
public class HW_Calculator {
    public static void main(String [] arg){
        int a;
        int b;
        int n;
        Scanner sc= new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         n=sc.nextInt();
         System.out.println("Input a number"+a);
         System.out.println("Input Second number"+b);

        switch(n){
            case 1:
                System.out.println("Addition");
                System.out.println(a+b);

                break;
            case 2:
                System.out.println("Substraction");
                System.out.println(a-b);
                break;
            case 3:
                System.out.println("Multiplication");
                System.out.println(a*b);
                break;
            case 4:
                System.out.println("Devision");
                System.out.println(a/b);
                
                break;
        } 
    }
}
