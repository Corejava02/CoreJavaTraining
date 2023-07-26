package Sumit;

import java.util.Scanner;

public class ArrrayPalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max limit:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0,t=0;
        for(int i=n-1;i>=0;i--)
        {
            a[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a[i]){
                t=t+1;
            }
        }
        if(t==n)
        {
            System.out.println("Array is palindromic");
        }
        else
        {
            System.out.println("Array is not palindromic");
        }
    } 
}
