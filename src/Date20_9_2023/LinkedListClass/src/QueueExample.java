import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

//        for(Integer i: q){
//            System.out.println(i);
//        }
//
//        q.poll();
//        System.out.println("***********************");
//        for(Integer i: q){
//            System.out.println(i);
//        }

        System.out.println(q.element());

        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
