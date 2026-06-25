import java.util.*;

public class AD_Q {

    public static void dequeDemo() {

        Deque<Integer> dq = new ArrayDeque<>();

        // offerFirst()
        dq.offerFirst(20);

        // offerLast()
        dq.offerLast(30);
        dq.offerLast(40);

        // add first element
        dq.offerFirst(10);

        System.out.println("Original Deque : " + dq);

        // peekFirst()
        System.out.println("Front : " + dq.peekFirst());

        // peekLast()
        System.out.println("Rear : " + dq.peekLast());

        // pollFirst()
        System.out.println("Removed Front : " + dq.pollFirst());

        // pollLast()
        System.out.println("Removed Rear : " + dq.pollLast());

        System.out.println("After Poll : " + dq);

        // contains()
        System.out.println("Contains 20 ? " + dq.contains(20));

        // size()
        System.out.println("Size : " + dq.size());

        // isEmpty()
        System.out.println("Is Empty ? " + dq.isEmpty());

        // clear()
        dq.clear();

        System.out.println("After Clear : " + dq);
    }

    public static void main(String[] args) {
        dequeDemo();
    }
}