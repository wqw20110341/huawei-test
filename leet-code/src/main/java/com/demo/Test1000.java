package com.demo;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test1000 {
    public static void main(String[] args) {
        // 最小堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 最大堆
        PriorityQueue<Integer> MaxHeap = new  PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(9);
        minHeap.add(11);
        minHeap.add(2);
        MaxHeap.add(10);
        MaxHeap.add(8);
        MaxHeap.add(9);
        MaxHeap.add(11);
        MaxHeap.add(2);
        System.out.println(minHeap.toString());
        System.out.println(MaxHeap.toString());

        System.out.println(minHeap.peek());
        System.out.println(MaxHeap.peek());

        System.out.println(minHeap.poll());
        System.out.println(MaxHeap.poll());
        System.out.println(minHeap.toString());
    }
}
