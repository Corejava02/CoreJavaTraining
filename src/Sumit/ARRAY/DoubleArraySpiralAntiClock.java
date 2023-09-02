package Sumit.ARRAY;

import java.util.Scanner;

public class DoubleArraySpiralAntiClock {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limit:");
        int r=sc.nextInt();
        System.out.println("Enter column limit:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int top=0,right=c,left=0,down=r;
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
        while(left<=right&&top<=down)
        {
            for(int i=left;i<right;i++)
            {
                System.out.println(arr[top][i]);
            }
            top++;
            for(int i=top;i<down;i++)
            {
                System.out.println(arr[i][right-1]);
            }
            right--;
            for(int j=right-1;j>left;j--)
            {
                System.out.println(arr[down-1][j]);
            }
            down--;
            for(int j=down-1;j>top;j--)
            {
                System.out.println(arr[j][left]);
            }
            left++;
        }
    }
}
