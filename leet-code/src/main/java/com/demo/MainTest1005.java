package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 5:46 PM
 */
public class MainTest1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] strList = sc.nextLine().split("");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < strList.length; i++) {
                list.add(Integer.parseInt(strList[i]));
            }
            int count = tempHandler(list);
            System.out.println(count);;
        }



    }

    private static int tempHandler(ArrayList<Integer> list) {
        int count  = 0 ;
        ArrayList<Integer> tmpVaList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) % 7 == 0  ){
                count++;
                tmpVaList.add(i);
            }
        }
        for (int i = 0; i < tmpVaList.size(); i++) {


        }



        return count;
    }
}
