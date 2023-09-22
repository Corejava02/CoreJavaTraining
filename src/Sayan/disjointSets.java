package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class disjointSets 
{
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
        set2.add(21);
        set2.add(11);
        System.out.println("Set2 = " + set2);

        boolean newSet = Collections.disjoint(set1, set2);  
        System.out.println("The Two Sets are Disjoint = " + newSet); 
    }
}
