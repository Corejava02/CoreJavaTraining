package Sumit;

import java.util.Scanner;

public class ArrayEvenOdd {
    void evenorodd(int a)
    {
        if(a%2==0)
        {
            System.out.println(a+" is even integer.");
        }
        else{
            System.out.println(a+" is odd integer.");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,10};
        ArrayEvenOdd ob=new ArrayEvenOdd();
        for(int i=0;i<9;i++){
            ob.evenorodd(arr[i]);
        }
        
        
    }

}
