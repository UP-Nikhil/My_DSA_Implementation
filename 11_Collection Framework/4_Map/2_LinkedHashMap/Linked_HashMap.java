import java.util.*;

public class Linked_HashMap {

    public static void LinkedHashMap_Methods() {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()
        map.put(101, "Rahul");
        map.put(102, "Aman");
        map.put(103, "Priya");
        map.put(104, "Neha");

        System.out.println("Original LinkedHashMap : " + map);

        // get()
        System.out.println("Value of Key 102 : " + map.get(102));

        // containsKey()
        System.out.println("Contains Key 103 ? " + map.containsKey(103));

        // containsValue()
        System.out.println("Contains Value Rahul ? " + map.containsValue("Rahul"));

        // replace()
        map.replace(103, "Shubham");
        System.out.println("After replace() : " + map);

        // putIfAbsent()
        map.putIfAbsent(105, "Ankit");
        map.putIfAbsent(101, "Rohan");
        System.out.println("After putIfAbsent() : " + map);

        // getOrDefault()
        System.out.println("Key 200 : " + map.getOrDefault(200, "Not Found"));

        // remove()
        map.remove(104);
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
        System.out.println("\nTraversing LinkedHashMap");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // clear()
        map.clear();

        System.out.println("After clear() : " + map);

        // isEmpty()
        System.out.println("Is Empty ? " + map.isEmpty());
    }

    public static void main(String[] args) {
        LinkedHashMap_Methods();
    }
}