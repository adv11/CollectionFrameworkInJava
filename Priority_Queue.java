package Collection_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // offer() / add() function for adding elements into the priority queue
        // the least element will be removed first
        // because it implements min-heap
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        pq.offer(10);
        pq.offer(8);
        pq.offer(19);
        System.out.println(pq); // output : [1, 3, 2, 10, 8, 19]

        // poll() / remove() for removing elements
        // removes the least elements due to its priority as a min-heap
        System.out.println(pq.poll());  // output : 1
        System.out.println(pq); // output : [2, 3, 19, 10, 8]

        // peek() function returns peek element in the priority queue
        System.out.println(pq.peek());  // output : 2
        System.out.println(pq); // output : [2, 3, 19, 10, 8]



        // We can change the priority order of the removal of the elements in the priority queue
        // by using Comparator
        PriorityQueue<Integer> nums = new PriorityQueue<>(Comparator.reverseOrder());   // now it implements max-heap property
        nums.offer(1);
        nums.offer(10);
        nums.offer(3);
        nums.offer(2);
        nums.offer(11);
        System.out.println(nums);   // output : [11, 10, 3, 1, 2] max element will be first

        System.out.println(nums.peek());    // output : 11

        System.out.println(nums.poll());    // output : 11
        System.out.println(nums);   // output : [10, 2, 3, 1]
    }
}
