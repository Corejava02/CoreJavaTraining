package Sumit;

import java.util.Scanner;

public class RemoveDuplicate {
    public int removeDuplicateElements(int arr[], int n){  
        if (n==0||n==1){  
            return n;  
        }  
        int temp[]=new int[n];  
        int j=0;  
        for (int i=0;i<n-1;i++){  
            if (arr[i]!=arr[i+1]){  
                temp[j++]=arr[i];  
            }  
         }  
        temp[j++]=arr[n-1];      
        for (int i=0;i<j;i++){  
            arr[i]=temp[i];  
        }  
        return j;  
    }  
    public static void main(String[] args) {
        RemoveDuplicate ob=new RemoveDuplicate();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max limit:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)   
        {  
            for (int j=i+1;j<n;j++)   
            {  
                int tmp=0;  
                if (arr[i]>arr[j])   
                {  
                    tmp=arr[i];  
                    arr[i]=arr[j];  
                    arr[j]=tmp;  
                }  
            }
        }  
        n=ob.removeDuplicateElements(arr, n);
        
        System.out.println("after deletion of duplicate elements in the array:");
         for(int i=0;i<n;i++)
         {
            System.out.println(arr[i]);
         }
    }
}
