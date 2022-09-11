package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 3:15 PM
 */
public class MainTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int num = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(i+1);
            }
            int count = 1 ;
            while (list.size()> 1 ){
                for (int i = 0; i < list.size();) {
                    int tmp = count % 3;
                    if(tmp == 0 ){
                        list.remove(i);
                    }else{
                        i++;
                    }
                    count ++ ;
                }
            }
            System.out.println(list.get(0));
        }

    }
}
