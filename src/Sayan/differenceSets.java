package Set;

import java.util.HashSet;
import java.util.Set;

public class differenceSets 
{
    private static <T> Set<T> setdifference(Set<T> set1, Set<T> set2) 
    {
        Set<T> ans = new HashSet<>(set1);
        ans.removeAll(set2);
        return ans;
    }
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(15);
        set1.add(29);
        set1.add(23);
        set1.add(16);
        set1.add(20);
        System.out.println("Set1 = " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(16);
        set2.add(21);
        System.out.println("Set2 = " + set2);

        Set<Integer> result = setdifference(set1, set2);
        System.out.println("Set Difference of The Two Sets = " + result);

    }
}
