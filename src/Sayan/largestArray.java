public class largestArray 
{
    public static void main(String[] args) 
    {
        int [] arr = {67, 12, 27, 91, 38, 42};    
        int lar = arr[0];    
        for (int i = 0; i < arr.length; i++) 
        {  
           if(arr[i] > lar)  
           {
               lar = arr[i];  
           }
        }  
        System.out.println("Largest Element in The Array = " +lar); 
    }
}
