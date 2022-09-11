package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 4:25 PM
 */
public class MainTest1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int num = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> list = new ArrayList<>();
            String[] strList = sc.nextLine().split(" ");
            for (int i = 0; i < strList.length; i++) {
                list.add(Integer.parseInt(strList[i]));
            }
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==0){
                    count ++;
                    list.set(i,1);
                }
            }
            int sum = 0;
            for (int i = 0; i < list.size() ; i++) {
                sum += list.get(i);
            }

            if(sum == 0 ){
                count++;
                list.set(0, list.get(0)+1);
            }
            System.out.println(count);
        }

    }
}
