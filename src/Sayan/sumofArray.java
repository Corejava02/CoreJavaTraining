public class sumofArray
{  
    public static void main(String[] args) 
    {  
        int [] arr = {25, 12, 43, 10, 48};  
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) 
        {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of These Array Elements = " + sum);  
    }  
}  