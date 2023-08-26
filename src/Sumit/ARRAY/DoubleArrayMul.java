package Sumit;

import java.util.Scanner;

public class DoubleArrayMul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limit:");
        int r=sc.nextInt();
        System.out.println("Enter column limit:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter 1st array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int p=0;
                for(int k=0;k<c;k++)
                {
                   p+=arr[i][k]*arr2[k][j]; 
                }
                System.out.print(p+" ");
                p=0;
            }
            System.out.println();
        }
    }
}
