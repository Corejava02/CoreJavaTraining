package Sumit;

import java.util.Scanner;

public class CapitaliseEachFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s+" ";
        String s1="";
        int l=s.length();
        int a=0;
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
               s1=s1+s.substring(a,a+1).toUpperCase()+s.substring(a+1,i+1);
               a=i+1;
            }
        }
        System.out.println(s1);
    }
}
