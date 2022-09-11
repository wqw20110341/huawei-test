package com.demo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 4:37 PM
 */
public class MainTest1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = Integer.parseInt(sc.nextLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            String[] pList = sc.nextLine().split(" ");
            String[] wList = sc.nextLine().split(" ");
            int pMax = 0;
            for (int i = 0; i <num ; i++) {
                if(i< pList.length && i < wList.length){
                    int p = Integer.parseInt(pList[i]);
                    if(pMax < p) pMax =p;
                    int w = Integer.parseInt(wList[i]);
                    map.put(p,w);
                }
            }
            int count  = 1 ;
            int sumMAx = 0;
            int temp = 0 ;
            if(map.containsKey(count)){
                temp =  map.get(count);
            }
            while (count*2 + 1 <= pMax ){
                while (count*2 <= pMax){
                    if(map.containsKey(count*2)){
                        temp += map.get(count*2);
                    }
                    if(sumMAx < temp){
                        sumMAx = temp;
                    }
                    count = 2 * count ;
                    break;
                }

                while (count*2 + 1 <= pMax){
                    if(map.containsKey(count*2 + 1 )){
                        temp += map.get(count*2 + 1);
                    }
                    if(sumMAx < temp){
                        sumMAx = temp;
                    }
                    count = 2 * count +1 ;
                    break;
                }
            }
            System.out.println(sumMAx);
        }

    }
}
