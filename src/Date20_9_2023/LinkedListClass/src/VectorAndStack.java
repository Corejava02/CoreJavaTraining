import java.util.*;
public class VectorAndStack {
    public static void main(String[] args) {
//        List<Integer> list = new Vector<>();
//        list.add(10);
//        list.add(20);
//        for (Integer i:list){
//            System.out.println(i);
//        }

        Stack<Integer> list1 = new Stack<>();
        list1.push(10);
        list1.push(20);
        list1.push(30);

        System.out.println(list1.peek());

        list1.pop();

        System.out.println(list1);
    }
}
