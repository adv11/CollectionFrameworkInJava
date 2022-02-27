package Collection_Framework;

import java.util.LinkedHashSet;
import java.util.Set;

// Same as HashSet but here order is maintained
public class Linked_Hash_Set {
    public static void main(String[] args) {
        Set<Integer> hashSet = new LinkedHashSet<>();

        // insertion in HashSet
        hashSet.add(12);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(38);
        hashSet.add(94);
        System.out.println(hashSet);    // output : [12, 20, 30, 38, 94]


        // remove element
        hashSet.remove(30);
        System.out.println(hashSet);    // output : [12, 20, 38, 94]


        // contains() method
        System.out.println(hashSet.contains(12));   // output : true
        System.out.println(hashSet.contains(100));  // output : false

        // size of the set
        System.out.println(hashSet.size()); // output : 4

        // set is empty or not
        System.out.println(hashSet.isEmpty());  // output : false

        // clear all elements in the set
        hashSet.clear();
        System.out.println(hashSet);    // output : []
    }
}
