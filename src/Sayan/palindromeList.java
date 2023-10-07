package List;

import java.util.ArrayList;
import java.util.List;

public class palindromeList 
{
    public static boolean palindrome(List<Integer> list) 
    {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left).equals(list.get(right))) 
            {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(20);
        list1.add(13);
        list1.add(20);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(20);
        list2.add(13);
        list2.add(23);

        System.out.println("List1 is Palindrome = " + palindrome(list1));
        System.out.println("List2 is Palindrome = " + palindrome(list2));
    }
}
