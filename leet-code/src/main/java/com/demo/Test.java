package com.demo;

public class Test {
    public static void main(String[] args) {
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        int max = maxValue(prices);
        System.out.println(max);
    }

    public static int maxValue(int[] prices) {
        if(prices.length <= 2) {
            return 0;
        }
        int min = prices[0];
        int maxOne = -prices[0];
        int doneOnceMax = 0;
        int sum = 0;
        for(int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            sum = Math.max(sum,maxOne+prices[i]);
            doneOnceMax = Math.max(doneOnceMax, prices[i] - min);
            maxOne = Math.max(maxOne,doneOnceMax - prices[i]);
        }
        return sum;
    }
}
