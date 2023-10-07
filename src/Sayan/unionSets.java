package Set;

import java.util.HashSet;
import java.util.Set;

public class unionSets 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(15);
        set1.add(20);
        set1.add(13);
        set1.add(10);
        set1.add(31);
        System.out.println("Set1 = " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(29);
        set2.add(16);
        set2.add(21);
        set2.add(34);
        set2.add(11);
        System.out.println("Set2 = " + set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union of the Two Sets = " + union);
    }
}
