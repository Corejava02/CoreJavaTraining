package Subham;
public class SumArrayElements {  
    public static void main(String[] args) {  
        int [] arr = new int [] {1, 12, 7, 5, 55};  
        int sum = 0;  
        
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  