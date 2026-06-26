import java.util.*;

public class Linked_hashSet {

    public static void LinkedHashSet_Methods() {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // add()
        set.add(5);
        set.add(10);
        set.add(39);
        set.add(12);
        set.add(87);
        set.add(10); // Duplicate (add nahi hoga)

        System.out.println("Original LinkedHashSet : " + set);

        // contains()
        System.out.println("Contains 12 ? " + set.contains(12));

        // remove()
        set.remove(12);
        System.out.println("After remove() : " + set);

        // size()
        System.out.println("Size : " + set.size());

        // isEmpty()
        System.out.println("Is Empty ? " + set.isEmpty());

        // addAll()
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(100);
        set2.add(200);

        set.addAll(set2);
        System.out.println("After addAll() : " + set);

        // containsAll()
        System.out.println("Contains All ? " + set.containsAll(set2));

        // removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll() : " + set);

        // retainAll()
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        set3.add(5);
        set3.add(39);

        set.retainAll(set3);
        System.out.println("After retainAll() : " + set);

        // clear()
        set.clear();
        System.out.println("After clear() : " + set);

        // isEmpty()
        System.out.println("Is Empty ? " + set.isEmpty());
    }

    public static void main(String[] args) {
        LinkedHashSet_Methods();
    }
}