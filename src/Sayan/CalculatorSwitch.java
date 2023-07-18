import java.util.*;

public class CalculatorSwitch
{
    public static void main(String[]args)
    {
        float num1, num2, result;
        char opt;
        Scanner cs = new Scanner(System.in);
        
        System.out.println("Enter The First Number = ");
        num1 = cs.nextFloat();
        System.out.println("Enter The Second Number = ");
        num2 = cs.nextFloat();
        System.out.println("Enter The Operator = ");
        opt = cs.next().charAt(0);
        
        switch(opt)
        {
            case '+' : result = (num1 + num2);
                       System.out.println("The Addition of This Two Numbers = "+result);
                       break;
                       
            case '-' : result = (num1 - num2);
                       System.out.println("The Subtraction of This Two Numbers = "+result);
                       break;
                       
            case '*' : result = (num1 * num2);
                       System.out.println("The Multiplication of This Two Numbers = "+result);
                       break;
                       
            case '/' : if(num2==0)
                       {
                            System.out.println("Any Number cannot be divided by 0.");
                       }
                       else
                       {
                            result = (num1 / num2);
                            System.out.println("The Division of This Two Numbers = "+result);
                       }
                       break;
                       
            default : System.out.println("Wrong Input!!! Enter The Righty Choice...");
        }
    }
}