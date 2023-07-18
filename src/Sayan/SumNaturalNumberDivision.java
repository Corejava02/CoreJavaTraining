import java.util.Scanner;

public class SumNaturalNumberDivision 
{
   public static void main( String args[])
   {
      int num, i=0, sum=0; 
      Scanner snn = new Scanner(System.in);

      System.out.print("Input a number: "); 
      num = snn.nextInt(); 

      while(i<= num) 
      {
         if(i%3 == 0 || i%5 == 0)
         {
            sum = sum + i;
         }
         i++;
      }
      System.out.println("sum of First "+num+" Natural Numbers that are divisible by 3 or 5 is = "+sum);
   }
}