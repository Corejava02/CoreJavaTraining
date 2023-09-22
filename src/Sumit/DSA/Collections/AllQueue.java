package Sumit.DSA.Collections;

import java.util.*;

public class AllQueue {
    public static class MyQueue {
        private Queue<Integer> queue1 = new Queue<>();
        private Queue<Integer> queue2 = new Queue<>();

        public void enqueue(Integer item) {
            queue1.push(item);
        }

        public T dequeue() {
            if (isEmpty()) {
                return null;
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
    public static void reverseQueue(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty()) {
        stack.push(queue.poll());
    }
    while (!stack.isEmpty()) {
        queue.offer(stack.pop());
    }
}
public static boolean isQueuePalindrome(Queue<Integer> queue) {
    Queue<Integer> reversedQueue = new LinkedList<>(queue);
    reverseQueue(reversedQueue);
    return queue.equals(reversedQueue);
}
public static void sortQueue(Queue<Integer> queue) {
    if (queue.isEmpty()) {
        return;
    }
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < size - i; j++) {
            int current = queue.poll();
            min = Math.min(min, current);
            queue.offer(current);
        }
        for (int j = 0; j < size - i; j++) {
            int current = queue.poll();
            if (current != min) {
                queue.offer(current);
            }
        }
        queue.offer(min);
    }
}
public static int getQueueSize(Queue<Integer> queue) {
    int size = 0;
    for (Integer ignored : queue) {
        size++;
    }
    return size;
}
public static int findMaxInQueue(Queue<Integer> queue) {
    if (queue.isEmpty()) {
        throw new IllegalArgumentException("Queue is empty");
    }
    int max = Integer.MIN_VALUE;
    for (Integer element : queue) {
        max = Math.max(max, element);
    }
    return max;
}
public static double findAverageOfQueue(Queue<Integer> queue) {
    if (queue.isEmpty()) {
        throw new IllegalArgumentException("Queue is empty");
    }
    int sum = 0;
    int count = 0;
    for (Integer element : queue) {
        sum += element;
        count++;
    }
    return (double) sum / count;
}
public static Queue<Integer> interleaveQueues(Queue<Integer> queue1, Queue<Integer> queue2) {
    Queue<Integer> result = new LinkedList<>();
    while (!queue1.isEmpty() || !queue2.isEmpty()) {
        if (!queue1.isEmpty()) {
            result.offer(queue1.poll());
        }
        if (!queue2.isEmpty()) {
            result.offer(queue2.poll());
        }
    }
    return result;
}
public static void removeElementFromQueue(Queue<Integer> queue, int elementToRemove) {
    while (queue.contains(elementToRemove)) {
        queue.remove(elementToRemove);
    }
}
public static void circularRotateQueue(Queue<Integer> queue, int k) {
    int size = queue.size();
    k = k % size; 
    if (k < 0) {
        k += size; 
    }
    for (int i = 0; i < k; i++) {
        queue.offer(queue.poll());
    }
}
    public static void main(String[] args) {
        
    }
}


