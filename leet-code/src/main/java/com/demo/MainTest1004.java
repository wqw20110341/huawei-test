package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 5:08 PM
 */
public class MainTest1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] strList = sc.nextLine().split(" ");
            int n = Integer.parseInt(strList[0]);
            int m = Integer.parseInt(strList[1]);
            String[] strTemp = sc.nextLine().split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                if(i < strTemp.length){
                    list.add(Integer.parseInt(strTemp[i]));
                }else{
                    list.add(0);
                }
            }
            ArrayList<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
                int count = 0 ;
                if(temp == 0 ){
                    resultList.add(count);
                }else{
                   count = tempHander(temp , m , count);
                   resultList.add(count);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < resultList.size(); i++) {
                builder.append(resultList.get(i));
                builder.append(" ");
            }
            System.out.println(builder);
        }

    }

    private static int tempHander(int temp, int m, int count) {
        boolean flag = true ;
        int sum ;
        for (int i = 0; i < 10; i++) {
            sum = (int) (temp + Math.pow(10,i));
            if(sum % m == 0 ){
                flag =false;
                break;
            }
        }
        if(flag){
            for (int i = 0; i < 10 ; i++) {
                return tempHander((int) (temp + Math.pow(10,i)),  m,  ++count);
            }
        }
        return ++count;
    }
}
