package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intesectionLists 
{
    public static void main(String[] args) 
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(19);
        list1.add(25);
        list1.add(39);
        list1.add(10);

        List<Integer> list2 = new ArrayList<>();
        list2.add(39);
        list2.add(15);
        list2.add(26);
        list2.add(25);
        list2.add(10);

        List<Integer> result = listIntersection(list1, list2);
        System.out.println("Intersection of The Two Lists = " + result);
    }

    public static List<Integer> listIntersection(List<Integer> list1, List<Integer> list2) 
    {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
}
