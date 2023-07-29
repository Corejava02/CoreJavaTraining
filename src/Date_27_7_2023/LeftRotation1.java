import java.util.Scanner;

public class LeftRotation1 {
    public static void main(String[] args)
    {
        int num;
        int [] arr = {12, 18, 15, 11, 17, 14, 16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Position = ");
        num = sc.nextInt();
        for(int i = 0; i < num; i++)
        {
            int j, temp;
            temp = arr[0];
            for(j = 0; j < arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        System.out.println("Array after Rotation = ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " +arr[i]);
        }
    }
}
