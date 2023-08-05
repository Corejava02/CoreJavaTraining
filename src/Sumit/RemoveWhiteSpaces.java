package Sumit;
import java.util.Scanner;

public class RemoveWhiteSpaces {
    void remove(String s)
    {
         int l=s.length();
        char ch;
        String s1="";
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            else{
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        RemoveWhiteSpaces ob=new RemoveWhiteSpaces();
        ob.remove(s); 
    }
}
