package Sumit.DSA.Collections;
import java.util.*;
public class AllSet {
    

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

      
        Set<Integer> uniqueSet = new HashSet<>(set1);
        System.out.println("List with duplicates removed: " + uniqueSet);

        boolean isDisjoint = set1.stream().noneMatch(set2::contains);
        System.out.println("Are sets disjoint? " + isDisjoint);

   
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        symmetricDifference.removeAll(commonElements);
        System.out.println("Symmetric Difference: " + symmetricDifference);

     
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Set Difference: " + difference);

    
        boolean areEqual = set1.equals(set2);
        System.out.println("Are sets equal? " + areEqual);


        int max = set1.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println("Maximum element: " + max);


        int min = set1.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println("Minimum element: " + min);
    }
}

