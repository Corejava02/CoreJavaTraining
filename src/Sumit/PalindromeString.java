package Sumit;

import java.util.Scanner;

public class PalindromeString {
    void checkPal(String s)
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+(s.charAt(i));
        }
        if(s1.equalsIgnoreCase(s))
        {
            System.out.println("The string is Palindrome.");
        }
        else{
            System.out.println("The string is not palindrome.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        PalindromeString ob=new PalindromeString();
        ob.checkPal(s);
    }
}
