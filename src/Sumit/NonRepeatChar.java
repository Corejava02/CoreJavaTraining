package Sumit;

import java.util.Scanner;

public class NonRepeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        char c;int count=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j))
            {
                count+=1;
            }
            }
            if(count==1)
            {
                System.out.println(c+" IS A FIRST NON REPEATATIVE CHARACTER..");
                count=0;
                break;
            }
            else
            {
                count=0;
            }
            
        }
        
        
    }
}
