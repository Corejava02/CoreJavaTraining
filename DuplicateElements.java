package Subham;
public class DuplicateElements {
    public static void main(String[]args) {
        int[] arr= new int[] {1,2,3,2,4,5,6,5,4};
        System.out.println("Duplicate numbers of the array: ");
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1;j<arr.length; j++) {
                if(arr[i]==arr[j])
                System.out.println(arr[j]);
            }
        }
    }
}