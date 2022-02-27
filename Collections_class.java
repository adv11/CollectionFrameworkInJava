package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_class {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(26);
        arrayList.add(6);

        // find min element
        System.out.println(Collections.min(arrayList)); // output : 2

        // max element
        System.out.println(Collections.max(arrayList)); // output : 26

        // Sorting
        Collections.sort(arrayList);
        System.out.println(arrayList);  // output : [2, 3, 6, 10, 26]

        // frequency of element
        System.out.println(Collections.frequency(arrayList, 3));    // output : 1

        // reverse
        Collections.reverse(arrayList);
        System.out.println(arrayList);  // output : [26, 10, 6, 3, 2]

        // sort according to your choice by using comparator
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println(arrayList);  // output : [26, 10, 6, 3, 2]
    }
}
