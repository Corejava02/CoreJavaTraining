import java.util.*;

public class SetExample1 {
    public static void main(String[] args) {
//        Set<Integer> a = new HashSet<>();
//        a.add(10);
//        a.add(20);
//        a.add(30);
//        a.add(40);
//        a.add(50);
//        a.add(60);
//        a.add(70);
//        a.add(80);
//        a.add(80);
//        a.add(80);
//        for(Integer i: a){
//            System.out.println(i);
//        }

//        Set<Integer> s = new LinkedHashSet<>();
//        s.add(10);
//        s.add(20);
//        s.add(30);
//        s.add(40);
//        s.add(50);
//        s.add(60);
//        s.add(70);
//        s.add(80);
//        s.add(80);
//        s.add(80);
//
//        for (Integer i : s) {
//            System.out.println(i);
//        }

        SortedSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(60);
        s.add(70);
        s.add(80);
        s.add(80);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        s.add(70);
        s.add(80);
        s.add(80);
        s.add(80);

        for (Integer i : s) {
            System.out.println(i);
        }
    }
}
