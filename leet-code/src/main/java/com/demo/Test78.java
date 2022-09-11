package com.demo;

import java.util.ArrayList;

public class Test78 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tmpList =new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tmpList.add(nums[i]);
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            helperHandler(tmpList,list,i,result);
        }
    }

    private static void helperHandler(ArrayList<Integer>  nums, ArrayList<Integer> list, int k, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer>  numsCopy = null;
        ArrayList<Integer> listCopy = null;

        if(list.size()==k){
            result.add(list);
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            numsCopy = new ArrayList<>(nums);
            listCopy = new ArrayList<>(list);
            listCopy.add(numsCopy.get(i));
            for (int j = i; j >=0 ; j--) {
                numsCopy.remove(i);
            }
            helperHandler(numsCopy,listCopy,k,result);
        }
    }
}
