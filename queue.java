package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // offer() function is used to add elements in the queue, if unsuccessful then returns false
        // we can also use add() function, but it returns exception in case element is not added successfully
        // so it better to used offer() function instead of add()
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        System.out.println(numbers);    // output : [1, 2, 3, 4]


        // poll() function is used to remove and return element from queue
        // returns null in case of empty queue
        // we can also use remove() function, but it returns exception if the queue is empty
        System.out.println(numbers.poll()); // output : 1
        System.out.println(numbers);    // output : [2, 3, 4]


        // peek() returns next element which is going to remove. Returns null if the queue is empty.
        // we can use element() function, but it returns exception if the queue is empty
        System.out.println(numbers.peek()); // output : 2
        System.out.println(numbers);    // output : [2, 3, 4]
    }
}
