import java.util.*;

public class Tree_Set {

    public static void TreeSet_Methods() {

        TreeSet<Integer> set = new TreeSet<>();

        // add()
        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(20);   // Duplicate

        System.out.println("Original TreeSet : " + set);

        // contains()
        System.out.println("Contains 20 ? " + set.contains(20));

        // remove()
        set.remove(40);
        System.out.println("After remove() : " + set);

        // size()
        System.out.println("Size : " + set.size());

        // first()
        System.out.println("First Element : " + set.first());

        // last()
        System.out.println("Last Element : " + set.last());

        // higher()
        System.out.println("Higher than 20 : " + set.higher(20));

        // lower()
        System.out.println("Lower than 20 : " + set.lower(20));

        // ceiling() apne najdik k higher element ka output dega;
        System.out.println("Ceiling of 25 : " + set.ceiling(25));

        // floor()
        System.out.println("Floor of 25 : " + set.floor(25));

        // pollFirst()
        System.out.println("Poll First : " + set.pollFirst());
        System.out.println(set);

        // pollLast()
        System.out.println("Poll Last : " + set.pollLast());
        System.out.println(set);

        // isEmpty()
        System.out.println("Is Empty ? " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear() : " + set);
    }

    public static void main(String[] args) {
        TreeSet_Methods();
    }
}