import java.util.*;

public class Hash_set {

    public static void HashSet_Methods() {

        HashSet<Integer> set = new HashSet<>();

        // add()
        set.add(5);
        set.add(10);
        set.add(39);
        set.add(12);
        set.add(87);
        set.add(10);   // Duplicate (add nahi hoga)

        System.out.println("Original Set : " + set);

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
        HashSet<Integer> set2 = new HashSet<>();
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
        HashSet<Integer> set3 = new HashSet<>();
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
        HashSet_Methods();
    }
}