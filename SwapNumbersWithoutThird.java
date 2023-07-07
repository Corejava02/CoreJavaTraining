import java.util.*;
public class SwapNumbersWithoutThird 
{
    public static void main(String[] args) 
    {
        int num1,num2;
        Scanner snt = new Scanner(System.in);

        System.out.println("Enter The First Number = ");
        num1 = snt.nextInt();
        System.out.println("Enter The Second Number = ");
        num2 = snt.nextInt();

        System.out.println("Before Swapping, num1 = "+num1+" and num2 = "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping, num1 = "+num1+" and num2 = "+num2);
    }   
}
