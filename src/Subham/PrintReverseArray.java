package Subham;
public class PrintReverseArray {
    public static void main(String[]args) {
        int[]arr=new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Array in Reverse Order: ");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
