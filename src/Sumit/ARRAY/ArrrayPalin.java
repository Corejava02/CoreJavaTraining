package Sumit;

import java.util.Scanner;

public class ArrrayPalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max limit:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int t=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n/2;i++)
        {
            if(arr[i]!=arr[n-i-1]){
                t=1;
                break;
            }
        }
        if(t!=1)
        {
            System.out.println("Array is palindromic");
        }
        else
        {
            System.out.println("Array is not palindromic");
        }
    } 
}
