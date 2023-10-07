package Set;

import java.util.HashSet;
import java.util.Set;

public class intersectionSets {
    public static void main(String[] args) 
    {
        Set <Integer> set1 = new HashSet <>();
        set1.add(15);
        set1.add(22);
        set1.add(29);
        set1.add(12);
        set1.add(25);
        System.out.println("Set1 = " + set1);

        Set <Integer> set2 = new HashSet <>();
        set2.add(29);
        set2.add(10);
        set2.add(15);
        set2.add(18);
        set2.add(22);
        System.out.println("Set2 = " + set2);

        set1.retainAll(set2);
        System.out.println("Intersection of This Two Sets = " + set1);
    }
}
