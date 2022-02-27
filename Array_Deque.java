package Collection_Framework;

import java.util.ArrayDeque;

// Doubly ended queue
// can be used in Sliding-window technique
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // insert element
        arrayDeque.offer(12);
        arrayDeque.offer(36);
        arrayDeque.offer(28);
        arrayDeque.offer(949);
        // insert element at the first place
        arrayDeque.offerFirst(20);
        // insert element at the last place
        arrayDeque.offerLast(8);


        System.out.println(arrayDeque); // output : [20, 12, 36, 28, 949, 8]

        // remove element
        System.out.println(arrayDeque.poll());  // output : 20
        // remove last element
        System.out.println(arrayDeque.pollLast());  // output : 8
        // remove first element
        System.out.println(arrayDeque.pollFirst()); // output : 12



        // find peek element
        System.out.println(arrayDeque.peek());  // output : 36
        // first peek element
        System.out.println(arrayDeque.peekFirst()); // output : 36
        // last peek element
        System.out.println(arrayDeque.peekLast());  // output : 949
    }
}
