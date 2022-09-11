package com.demo;

import java.util.Vector;

public class Test01_old {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(-1);
        vector.add(2);
        vector.add(1);
        vector.add(4);
        int target = 2;
        int sumClosest = theeSumClosest(vector, target);
        System.out.println(sumClosest);
    }

    private static int theeSumClosest(Vector<Integer> nums ,int target){
        Vector<Integer> vector =   new Vector<>();
        int sum = 0 ;
//        helperHandler(nums ,vector,3,sum );
//        return helper;
        return  sum;
    }
//    private static int theeSumClosest(Vector<Integer> nums ,int target){
//        ArrayList<Integer> tmpList = new ArrayList<>();
//        for (int i = 0; i <nums.size(); i++) {
//            for (int j = i+1; j < nums.size(); j++) {
//                for (int k = j+1; k < nums.size(); k++) {
//                    int sum = nums.get(i)+ nums.get(j)+ nums.get(k);
//                    tmpList.add(sum);
//                }
//            }
//        }
//        Collections.sort(tmpList,((o1, o2) -> {
//            int sub1 = o1-target;
//            int sub2 = o2-target;
//            return Math.abs(sub1)-Math.abs(sub2);
//        }));
//        return tmpList.get(0);
//    }
}
