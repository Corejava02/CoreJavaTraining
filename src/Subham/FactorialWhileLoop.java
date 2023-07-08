package Subham;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[]args) {
        int fact=1;
        int i=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Whose Factorial is to be Found");
        
        int num=sc.nextInt();

        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("\nFactorial of" +num+ "is:" +fact);


    }
    
}
