import java.util.*;

public class ArrList {
    public static void Arraylist() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(39);
        list.add(12);
        list.add(87);

        System.out.println("Original List : " + list);

        // contains()
        System.out.println("Contains 12 ? " + list.contains(12));

        // get()
        System.out.println("Value at index 2 : " + list.get(2));

        // set()
        list.set(2, 20);
        System.out.println("After set() : " + list);

        // remove value 12
        list.remove(Integer.valueOf(12));
        System.out.println("After remove() : " + list);

        // size()
        System.out.println("Size : " + list.size());

        // indexOf()
        System.out.println("Index of 87 : " + list.indexOf(87));

        // isEmpty()
        System.out.println("Is Empty ? " + list.isEmpty());

        // Collections.sort()
        Collections.sort(list);
        System.out.println("After sort() : " + list);

        // Collections.reverse()
        Collections.reverse(list);
        System.out.println("After reverse() : " + list);

        // Collections.max()
        System.out.println("Max Element : " + Collections.max(list));

        // Collections.min()
        System.out.println("Min Element : " + Collections.min(list));
    }

    public static void main(String[] args) {
        Arraylist();
    }
}