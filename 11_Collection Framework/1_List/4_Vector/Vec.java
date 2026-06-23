

// add(value)          -> element add karta hai

// add(index,value)    -> given index par insert karta hai

// get(index)          -> index ki value return karta hai

// set(index,value)    -> index ki value update karta hai

// remove(index)       -> index ka element remove karta hai

// remove(Object)      -> given value remove karta hai

// contains(value)     -> true/false return karta hai

// size()              -> total elements return karta hai

// indexOf(value)      -> first index return karta hai

// lastIndexOf(value)  -> last index return karta hai

// isEmpty()           -> vector empty hai ya nahi

// clear()             -> saare elements delete

// firstElement()      -> first element return karta hai

// lastElement()       -> last element return karta hai

// capacity()          -> current capacity return karta hai

// addAll()            -> dusre collection ke elements add karta hai
/*
ArrayList vs Vector
ArrayList -> Fast, Not Thread Safe

Vector    -> Thread Safe, Thoda Slow
Aajkal
ArrayList

almost har project me use hota hai.

Vector

// mostly theory aur interview questions me pucha jata hai.

DSA me Vector ke most important methods

add()
get()
set()
remove()
size()
contains()
isEmpty()

firstElement()
lastElement()
capacity() */


import java.util.*;

public class Vec {

    public static void vectorDemo() {

        Vector<Integer> vec = new Vector<>();

        // add()
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        System.out.println("Original Vector : " + vec);

        // contains()
        System.out.println("Contains 20 ? " + vec.contains(20));

        // get()
        System.out.println("Value at index 2 : " + vec.get(2));

        // set()
        vec.set(2, 99);
        System.out.println("After set() : " + vec);

        // remove(value)
        vec.remove(Integer.valueOf(20));
        System.out.println("After remove(20) : " + vec);

        // size()
        System.out.println("Size : " + vec.size());

        // indexOf()
        System.out.println("Index of 40 : " + vec.indexOf(40));

        // lastIndexOf()
        System.out.println("Last Index of 50 : " + vec.lastIndexOf(50));

        // isEmpty()
        System.out.println("Is Empty ? " + vec.isEmpty());

        // firstElement()
        System.out.println("First Element : " + vec.firstElement());

        // lastElement()
        System.out.println("Last Element : " + vec.lastElement());

        // Collections.sort()
        Collections.sort(vec);
        System.out.println("After sort() : " + vec);

        // Collections.reverse()
        Collections.reverse(vec);
        System.out.println("After reverse() : " + vec);

        // Collections.max()
        System.out.println("Max Element : " + Collections.max(vec));

        // Collections.min()
        System.out.println("Min Element : " + Collections.min(vec));

        // clear()
        vec.clear();
        System.out.println("After clear() : " + vec);
    }

    public static void main(String[] args) {
        vectorDemo();
    }
}
// 
