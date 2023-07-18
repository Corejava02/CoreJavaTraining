package Sumit;

import java.util.Scanner;

public class palstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println("It is a palindrome string.");
        }
        else
        {
            System.out.println("It is not a palindrome string.");
        }
    }
}
