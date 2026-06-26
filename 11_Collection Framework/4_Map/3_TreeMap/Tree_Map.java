import java.util.*;

public class Tree_Map {

    public static void TreeMap_Methods() {

        TreeMap<Integer, String> map = new TreeMap<>();

        // put()
        map.put(50, "Rahul");
        map.put(10, "Aman");
        map.put(40, "Priya");
        map.put(20, "Neha");
        map.put(30, "Ankit");

        System.out.println("Original TreeMap : " + map);

        // get()
        System.out.println("Value of Key 20 : " + map.get(20));

        // containsKey()
        System.out.println("Contains Key 40 ? " + map.containsKey(40));

        // containsValue()
        System.out.println("Contains Value Rahul ? " + map.containsValue("Rahul"));

        // firstKey()
        System.out.println("First Key : " + map.firstKey());

        // lastKey()
        System.out.println("Last Key : " + map.lastKey());

        // higherKey()
        System.out.println("Higher Key than 20 : " + map.higherKey(20));

        // lowerKey()
        System.out.println("Lower Key than 20 : " + map.lowerKey(20));

        // ceilingKey()
        System.out.println("Ceiling Key of 25 : " + map.ceilingKey(25));

        // floorKey()
        System.out.println("Floor Key of 25 : " + map.floorKey(25));

        // replace()
        map.replace(30, "Shubham");
        System.out.println("After replace() : " + map);

        // remove()
        map.remove(40);
        System.out.println("After remove() : " + map);

        // size()
        System.out.println("Size : " + map.size());

        // keySet()
        System.out.println("Keys : " + map.keySet());

        // values()
        System.out.println("Values : " + map.values());

        // entrySet()
        System.out.println("Entries : " + map.entrySet());

        // Traversing
        System.out.println("\nTraversing TreeMap");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // pollFirstEntry()
        System.out.println("Poll First : " + map.pollFirstEntry());

        // pollLastEntry()
        System.out.println("Poll Last : " + map.pollLastEntry());

        System.out.println("After Poll : " + map);

        // clear()
        map.clear();

        System.out.println("After clear() : " + map);

        // isEmpty()
        System.out.println("Is Empty ? " + map.isEmpty());
    }

    public static void main(String[] args) {
        TreeMap_Methods();
    }
}