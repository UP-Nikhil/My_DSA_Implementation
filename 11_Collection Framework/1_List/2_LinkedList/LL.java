import java.util.*;
public class LL {
    public static void  Linkedlist(){
        LinkedList<Integer> list= new LinkedList<>();
        list.add(98);
        list.add(90);
        list.add(9);
        list.add(80);
        list.add(70);
        list.add(60);
        System.out.println(list);
        
        // contains()
        System.out.println("Contains 12 ? " + list.contains(12));

        // get()
        System.out.println("Value at index 2 : " + list.get(2));

        // set()
        list.set(2, 20);
        System.out.println("After set() : " + list);

        // remove value 12
        list.remove(Integer.valueOf(90));
        System.out.println("After remove(90) : " + list);

        // size()
        System.out.println("Size : " + list.size());

        // indexOf()
        System.out.println("Index of 80 : " + list.indexOf(80));

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
        Linkedlist();
    }
}
