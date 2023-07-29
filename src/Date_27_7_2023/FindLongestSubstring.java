import java.util.Scanner;

/**
 *
 */
public class FindLongestSubstring {
    public int duplicate(String s,int i,int j)
    {
        char A[]=new char[30];
        int c=0;
        int flag=0;
        for(int r=i;r<=j;r++)
        {
            A[r]=s.charAt(r);
        }
        for(int r=i;r<=j;r++)
        {
            for(int c1=i;c1<=j;c1++)
            {
                if(A[r]==A[c1])
                {
                    c=c+1;
                }
            }
            if(c>1)
            {
                flag=1;
                c=0;
            }
            else{
                c=0;
            }
        }
        if(flag==0)
        {
            return (j-i+1);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        FindLongestSubstring ob=new FindLongestSubstring();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        int len=0,l=0;

        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                l=ob.duplicate(s,i,j);
                if(l!=0)
                {
                    if(len<l)
                    {
                        len=l;
                    }
                }
            }
        }
        System.out.println("The longest length of substring is: "+len);
    }
}
