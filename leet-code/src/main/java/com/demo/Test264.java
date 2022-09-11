package com.demo;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Test264 {
    public static void main(String[] args) {

        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        queue.add(1);
        set.add(1);
        int result = 1;
        int[] factors = new int[]{2,3,5};
        for (int i = 0; i < n; i++) {
            result = queue.poll();
            for (int factor: factors) {
                int newNum = result * factor;
                if(!set.contains(newNum)){
                    set.add(newNum);
                    queue.add(newNum);
                }
            }
        }
        return result;
    }
}
