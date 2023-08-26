package Sumit;

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter max limit:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter array1 elements:");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter array2 elements:");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("The common elements of two arrays:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[i]==arr2[j])
            {
                System.out.println(arr2[j]);
            }
            }
            
        }
    }
}
