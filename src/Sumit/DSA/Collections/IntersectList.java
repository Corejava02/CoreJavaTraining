package Sumit.DSA.Collections;
import java.util.*;
public class IntersectList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        
        list1.retainAll(list2);
        
        System.out.println(list1);
    }
}


