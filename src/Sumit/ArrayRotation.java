package Sumit;

import java.util.Scanner;

public class ArrayRotation {
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
        System.out.println("Enter no.of position by which array will be rotated left side:");
        int pos=sc.nextInt();
        int t=0,c=0;
        for(int i=1;i<=pos;i++)
        {
            t=arr[0];
            for(int j=1;j<n;j++)
            {
                c=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=c;
            }
            arr[n-1]=t;
        }
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
