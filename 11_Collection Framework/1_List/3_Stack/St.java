import java.util.*;

public class St {

    public static void stackDemo() {

        Stack<Integer> st = new Stack<>();

        // push()
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack : " + st);

        // peek() -> top element return karta hai
        System.out.println("Top Element : " + st.peek());

        // pop() -> top element remove karke return karta hai
        System.out.println("Popped Element : " + st.pop());
        System.out.println("After pop() : " + st);

        // contains()
        System.out.println("Contains 20 ? " + st.contains(20));

        // get()
        System.out.println("Value at index 1 : " + st.get(1));

        // set()
        st.set(1, 99);
        System.out.println("After set() : " + st);

        // remove()
        st.remove(Integer.valueOf(20));
        System.out.println("After remove(20) : " + st);

        // size()
        System.out.println("Size : " + st.size());

        // indexOf()
        System.out.println("Index of 40 : " + st.indexOf(40));

        // isEmpty()
        System.out.println("Is Empty ? " + st.isEmpty());

        // search()
        System.out.println("Position of 10 from top : " + st.search(10));

        // Collections.sort()
        Collections.sort(st);
        System.out.println("After sort() : " + st);

        // Collections.reverse()
        Collections.reverse(st);
        System.out.println("After reverse() : " + st);

        // Collections.max()
        System.out.println("Max Element : " + Collections.max(st));

        // Collections.min()
        System.out.println("Min Element : " + Collections.min(st));

        // clear()
        st.clear();
        System.out.println("After clear() : " + st);
    }

    public static void main(String[] args) {
        stackDemo();
    }
}