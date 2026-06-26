import java.util.*;

public class Hash_Map {

    public static void HashMap_Methods() {

        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Rahul");
        map.put(102, "Aman");
        map.put(103, "Priya");
        map.put(104, "Neha");

        System.out.println("Original HashMap : " + map);

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

        // for-each using entrySet()
        System.out.println("\nTraversing HashMap");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Using var variabel without declaration data type : ");
        for( var e : map.entrySet()){
            System.out.println(e);
        }

        // clear()
        map.clear();

        System.out.println("After clear() : " + map);

        // isEmpty()
        System.out.println("Is Empty ? " + map.isEmpty());
    }

    public static void main(String[] args) {
        HashMap_Methods();
    }
}