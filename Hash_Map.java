package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

// stores key-value pair
// keys should be unique
public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // insertion of elements
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        System.out.println(hashMap);    // output : {Five=5, One=1, Four=4, Two=2, Three=3}


        // this will update the value of the key
        hashMap.put("Two", 23);
        System.out.println(hashMap);    // output : {Five=5, One=1, Four=4, Two=23, Three=3}

        // if you don't want to update the value then apply check
        hashMap.putIfAbsent("One", 10);
        System.out.println(hashMap);    // output : {Five=5, One=1, Four=4, Two=23, Three=3} here value of key One is 1 as before.



        // iteration in HashMap
        for(Map.Entry<String, Integer> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // for iteration in keys
        for(String  key : hashMap.keySet()){
            System.out.print(key + " ");    // output : Five One Four Two Three
        }
        System.out.println();

        // for iteration in values
        for(int value : hashMap.values()){
            System.out.print(value + " ");  // output : 5 1 4 23 3
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
