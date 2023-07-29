/**
 * arr[] = {3,6,0,6,3} -> palindrome
 * [1,2,3,4,5] -> not palindrome
 * <p>
 * <p>
 * s = "abcabcbb"
 */
public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,1};
        int n = arr.length;
        palindrome(arr,n);
    }

    static void palindrome(int[] arr, int n) {
        int c = 0;
        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                c = 1;
                break;
            }
        }
        if(c==1){
            System.out.println("Not Palindrome");
        }
        else {
            System.out.println("Palindrome");
        }
    }
}
