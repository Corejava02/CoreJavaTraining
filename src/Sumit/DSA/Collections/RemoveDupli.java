package Sumit.DSA.Collections;

import java.util.*;

public class RemoveDupli {
     public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> unSet = new LinkedHashSet<>(myList);
        myList.clear();
        myList.addAll(unSet);
        System.out.println(myList);
    }
}
