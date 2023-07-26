public class evenPosition {
    public static void main(String[] args) {
        int [] arr = {12, 15, 65, 23, 64, 46, 92};  
  
        System.out.println("Elements of An Array present in The Even Position = ");  
        for (int i = 1; i < arr.length; i = i+2) 
        {  
            System.out.println(arr[i]);  
        }  
    }
}
