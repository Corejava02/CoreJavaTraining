package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class implementQueue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(15);
        queue.offer(20);
        queue.offer(19);
        queue.offer(25);
        queue.offer(21);
        queue.offer(12);
        System.out.println("The Queue = ");
        for(Integer i: queue)
        {
            System.out.println(i);
        }

        queue.poll();
        System.out.println("The New Queue = ");
        for(Integer i: queue)
        {
            System.out.println(i);
        }
    }
}
