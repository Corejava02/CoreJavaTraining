package Sumit;

import java.util.Scanner;

public class ReverseOrdWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s+" ";
        String w="",s2=" ";
        int l=s.length(),f=0;
        char c;int i=0;
        while(i<l)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                int j=f;
                while(j<=i)
                {
                    w=w+s.charAt(j);
                    j++;
                }
                s2=w+s2;
                f=i+1;
                w="";
            }
            i++;
        }
        System.out.println(s2);
    }
}
