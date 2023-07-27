public class arrayPalindrome {
    public static void main(String[] args) {
        int c=0;
        int arr [] = {3, 6, 0, 6, 3};
        for(int i=0; i<arr.length/2; i++)
        {
            if(arr[i] != arr[arr.length-i-1])
            {
                c=1;
                break;
            }
        }
        if(c != 1)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
