import java.util.*;

public class MaxH {

    public static void priorityQueueDemo() {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // offer()
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(40);

        System.out.println("Original PQ : " + pq);

        // peek()
        System.out.println("Top Element : " + pq.peek());

        // poll()
        System.out.println("Removed Element : " + pq.poll());
        System.out.println("After poll() : " + pq);

        // contains()
        System.out.println("Contains 30 ? " + pq.contains(30));

        // size()
        System.out.println("Size : " + pq.size());

        // isEmpty()
        System.out.println("Is Empty ? " + pq.isEmpty());

        // clear()
        pq.clear();

        System.out.println("After clear() : " + pq);
    }

    public static void main(String[] args) {
        priorityQueueDemo();
    }
}