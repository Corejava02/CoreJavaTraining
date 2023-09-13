import java.util.*;

public class ListExample {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(10); // default size 10,size>10, 50% of original size
//        list.add(10);
//        list.add(20);
//        list.add(25);
////        list.set(1,100);
//
//        list.add(1,100);
//
////        System.out.println("4th index value"+list.get(4));
//
//        for(Integer i: list){
////            if(i%2==0){
////                System.out.println(i);
////            }
//            System.out.println(i);
//        }
////        System.out.println("5th index value"+list.get(5));


//        List<Integer> list1 = new LinkedList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        System.out.println(list1.get(1));
//        list1.add(1,100);
//        System.out.println(list1);

//        List<Integer> list = new Vector<>(10); // by default capacity is 10, increases size by double
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list.get(1));
//        list.add(1,100);
//        System.out.println(list);

        Stack<Integer> list = new Stack<>(); // LIFO, elements are added and removed from las
        list.push(10);
        list.push(20);
        list.push(30);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
    }
}
