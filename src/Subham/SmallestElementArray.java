package Subham;
public class SmallestElementArray {  
    public static void main(String[] args) {  
  
         
        int [] arr = new int [] {25, 51, 69, 5, 108};  
        int min = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
            if(arr[i] < min)  
            min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
}  