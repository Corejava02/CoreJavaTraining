package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateSets {
    public static <T> List<T> removeDuplicates(List<T> list) 
    {
        Set<T> set = new HashSet<>(list);
        List<T> newList = new ArrayList<>(set);
        return newList;
    }

    public static void main(String[] args) 
    {
        List<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(29);
        num.add(12);
        num.add(15);
        num.add(22);
        num.add(10);
        num.add(22);

        List<Integer> newNumbers = removeDuplicates(num);

        System.out.println("The Original List = " + num);
        System.out.println("After Removing The Duplicates, The List = " + newNumbers);
    }
}
