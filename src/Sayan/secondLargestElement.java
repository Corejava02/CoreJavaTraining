public class secondLargestElement {
    public static void main(String[] args) {
    int temp, len;
      int arr[] = {12, 35, 65, 41, 22, 38, 85, 64, 75};
      len = arr.length;

      for(int i = 0; i<len; i++ )
      {
         for(int j = i+1; j<len; j++)
         {

            if(arr[i]>arr[j])
            {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.println("Second Largest Number in The Array = "+arr[len-2]);
    }
}
