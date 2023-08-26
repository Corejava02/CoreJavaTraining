package Sumit;
import java.util.Scanner;

public class DuplicateElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max limit:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        System.out.println("Duplicate elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c=c+1;
                }
            }
            if(c>1)
            {
                System.out.println(arr[i]);
                c=0;
            }
            else{
                c=0;
            }
        }
    }
}
