package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 3:36 PM
 */
public class MainTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            String[] lineM = sc.nextLine().split(",");
            String[] lineN = sc.nextLine().split(",");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < lineM.length; i++) {
                list.add(Integer.parseInt(lineM[i]));
            }
            for (int j = 0; j < lineN.length; j++) {
                list.add(Integer.parseInt(lineN[j]));
            }
            Collections.sort(list);
            StringBuilder builder = new StringBuilder();
            Iterator<Integer> iterator = list.stream().iterator();
            while (iterator.hasNext()){
                builder.append(iterator.next());
                builder.append(" ");
            }
            System.out.println(builder);
        }
    }
}
