package Collection_Framework;

import java.util.Map;
import java.util.TreeMap;

// implements binary search tree
// sorts according to keys
public class Tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new TreeMap<>();

        // insertion of elements
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        System.out.println(hashMap);    // output : {Five=5, Four=4, One=1, Three=3, Two=2}


        // this will update the value of the key
        hashMap.put("Two", 23);
        System.out.println(hashMap);    // output : {Five=5, Four=4, One=1, Three=3, Two=23}

        // if you don't want to update the value then apply check
        hashMap.putIfAbsent("One", 10);
        System.out.println(hashMap);    // output : {Five=5, Four=4, One=1, Three=3, Two=23}



        // iteration in HashMap
        for(Map.Entry<String, Integer> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // for iteration in keys
        for(String  key : hashMap.keySet()){
            System.out.print(key + " ");    // output : Five Four One Three Two
        }
        System.out.println();

        // for iteration in values
        for(int value : hashMap.values()){
            System.out.print(value + " ");  // output :5 4 1 3 23
        }
        System.out.println();

        // for checking key is present or not
        System.out.println(hashMap.containsKey("Deepak"));  // output : false
        // for checking value is present or not
        System.out.println(hashMap.containsValue(23));   // output : true

        // isEmpty
        System.out.println(hashMap.isEmpty());  // output : false

        // clear hashMap
        hashMap.clear();
        System.out.println(hashMap);    // output : {}
    }
}
