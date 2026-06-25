import java.util.*;

public class Queue_LL {

    static void queueDemo() {

        Queue<Integer> q = new LinkedList<>();

        // offer() -> rear/end me element add karta hai
        q.offer(2);
        q.offer(10);
        q.offer(90);
        q.offer(9);
        q.offer(5);

        System.out.println("Original Queue : " + q);

        // peek() -> front element return karta hai
        System.out.println("Front Element : " + q.peek());

        // poll() -> front element remove + return karta hai
        System.out.println("Removed Element : " + q.poll());
        System.out.println("After poll() : " + q);

        // contains() return true or false;
        System.out.println("Contains 90 ? " + q.contains(90));

        // size()
        System.out.println("Size : " + q.size());

        // isEmpty()
        System.out.println("Is Empty ? " + q.isEmpty());

        // clear()
        q.clear();
        System.out.println("After clear() : " + q);

        // isEmpty() after clear
        System.out.println("Is Empty ? " + q.isEmpty());
    }

    public static void main(String[] args) {
        queueDemo();
    }
}
