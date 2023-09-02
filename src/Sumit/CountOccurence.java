package Sumit;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Enter a letter whose number of occurence is to be printed:");
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                count=count+1;
            }
        }
        System.out.println("Total count is: "+count);
    }
}
