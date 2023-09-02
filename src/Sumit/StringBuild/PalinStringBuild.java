package Sumit.StringBuild;
import java.util.*;

public class PalinStringBuild {
    boolean isPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        PalinStringBuild ob=new PalinStringBuild();
        if (ob.isPalindrome(s)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
