public class oddEvenArray {
    public static void main(String[] args) {
        int arr [] = {23, 64, 51, 55, 84, 12, 14, 39};  
        System.out.println("Even Numbers in The Array = ");  
        for(int i=0;i<arr.length;i++)
        {  
            if(arr[i]%2==0)
            {  
                System.out.println(arr[i]);  
            }  
        }  
        System.out.println("Odd Numbers in The Array = ");  
        for(int i=0;i<arr.length;i++)
        {  
            if(arr[i]%2!=0)
            {  
                System.out.println(arr[i]);  
            }  
        }         
    }
}
