public class smallestArray {
    public static void main(String[] args) 
    {
        int [] arr = {67, 12, 27, 91, 38, 42};    
        int sma = arr[0];    
        for (int i = 0; i < arr.length; i++) 
        {  
           if(arr[i] < sma)  
           {
               sma = arr[i];  
           }
        }  
        System.out.println("Smallest Element in The Array = " +sma); 
    }
}
