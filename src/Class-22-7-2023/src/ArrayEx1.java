// Advantages -> Code optimization, random access
// Disadvantages -> size limit
// singe and multi dimentional

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int []arr = {5,6,7,8,9,10}; // if we know the values
        int []arr1 = new int[4];
//        System.out.println(arr[3]); // fetch
        arr1[2] = 20; // store
        arr1[0] = 10;
//        System.out.println(arr.length);
        getVal(arr);
    }

    public static void getVal(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
