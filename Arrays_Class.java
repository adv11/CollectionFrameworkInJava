package Collection_Framework;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Class {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);    // for binary search
        System.out.println("Index of key:4 is : " + index); // output : Index of key:4 is : 3

        // Sorting
        Arrays.sort(numbers);   // for sorting the array
        int[] a = {10, 28, 1, 3, 39, 8, 939};
        Arrays.sort(a, 1, 4);
        System.out.println(Arrays.toString(a)); // output : [10, 1, 3, 28, 39, 8, 939]


        // Automatic fill
        int[] b = new int[10];
        Arrays.fill(b, 12);
        System.out.println(Arrays.toString(b)); // output : [12, 12, 12, 12, 12, 12, 12, 12, 12, 12]
    }
}
