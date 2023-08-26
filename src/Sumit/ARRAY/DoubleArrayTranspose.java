package Sumit;

import java.util.Scanner;

public class DoubleArrayTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limit:");
        int r=sc.nextInt();
        System.out.println("Enter column limit:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
