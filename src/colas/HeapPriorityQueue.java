package colas;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapPriorityQueue {

    public static void main(String[] args) {

        // Create a min-heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Create a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //Heapify an array
        // Min-heap
        PriorityQueue<Integer> heap = new PriorityQueue(Arrays.asList(1,2,3));

        // Max-heap
        PriorityQueue<Integer> heap2 = new PriorityQueue<>(Collections.reverseOrder());
        heap2.addAll(Arrays.asList(1,2,3));

        System.out.println(heap);
        System.out.println(heap2);

    }
}
