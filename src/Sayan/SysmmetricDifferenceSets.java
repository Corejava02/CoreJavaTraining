package Set;

import java.util.HashSet;
import java.util.Set;

public class SysmmetricDifferenceSets 
{
    public static void main(String[] args) {
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

        set1.removeAll(set2);
        System.out.println("The Symmetric Difference between The Two Sets = " + set1);
    }
}
