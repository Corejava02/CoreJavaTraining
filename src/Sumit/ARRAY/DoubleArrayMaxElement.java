package Sumit;

import java.util.Scanner;

public class DoubleArrayMaxElement {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limit:");
        int r=sc.nextInt();
        System.out.println("Enter column limit:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int max=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        max=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max element in the array is:"+max);
    }  
}
