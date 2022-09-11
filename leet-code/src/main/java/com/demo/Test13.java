package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Test13 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }

    public static String intToRoman(int num) {
        ArrayList<MapHelper> mapHelpers = new ArrayList<>();
        mapHelpers.add(new MapHelper(1, "I"));
        mapHelpers.add(new MapHelper(4 , "IV"));
        mapHelpers.add(new MapHelper(5 , "V"));
        mapHelpers.add(new MapHelper(9 , "IX"));
        mapHelpers.add(new MapHelper(10, "X"));
        mapHelpers.add(new MapHelper(40 , "XL"));
        mapHelpers.add(new MapHelper(50 , "L" ));
        mapHelpers.add(new MapHelper(90 , "XC"));
        mapHelpers.add(new MapHelper(100, "C"));
        mapHelpers.add(new MapHelper(400 , "CD"));
        mapHelpers.add(new MapHelper(500 , "D"));
        mapHelpers.add(new MapHelper(900 , "CM"));
        mapHelpers.add(new MapHelper(1000 , "M"));

        int index = mapHelpers.size();
        StringBuilder builder = new StringBuilder();
        while (num > 0 ){
            index--;
            MapHelper map = mapHelpers.get(index);
            if(num >= map.val){
                int  count =  num / map.val;
                while (count>0){
                    builder.append(map.str);
                    count--;
                }
                num = num%map.val;
            }
        }
        return String.valueOf(builder);
    }

    private static class MapHelper{
        private String str;
        private int val;

        public MapHelper(  int val ,  String str) {
            this.str = str;
            this.val = val;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }


    }
}
