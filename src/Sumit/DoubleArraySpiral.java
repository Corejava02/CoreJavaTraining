package Sumit;

import java.util.Scanner;

public class DoubleArraySpiral {
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
        System.out.println("Original Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Clockwise Spiral Matrix:");
        int r1=0,c1=0;
       while(r1<r && c1<c)
       {
        for(int i=c1;i<c;i++)
        {
            System.out.println(arr[r1][i]+" ");
        }
        r1++;
        for(int i=c1;i<r;i++)
        {
            System.out.println(arr[i][c-1]+" ");
        }
        c--;
        for(int i=c1;i>=0;i--)
        {
            System.out.println(arr[r2][i]);
        }
        r2--;
        for(int i=r1;i<)
       }
    }
}
