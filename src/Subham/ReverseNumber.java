package Subham;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a Number");
            int number = scanner.nextInt();

            int reversedNumber = 0;
            while (number !=0) {
                int remainder = number % 10;
                reversedNumber = reversedNumber *10 + remainder;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversedNumber);
             
        }
            
        
    }
    

