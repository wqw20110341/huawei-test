package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/9/2022 3:46 PM
 */
public class Test1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int num =Integer.parseInt(sc.nextLine());
            String[] tmpStr = sc.nextLine().split(" ");
            int[] result = new int[num];
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < tmpStr.length; i++) {
                int tmpVal = Integer.parseInt(tmpStr[i]);
                boolean flag = true;
                for (int j = 1; j < tmpVal; j++) {
                    if(result[j-1]==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result[tmpVal-1] = i+1;
                    int count = tmpVal+1;
                    while (list.contains(String.valueOf(count))){
                        result[count-1] = i+1;
                        list.remove(String.valueOf(count));
                        count++;
                    }
                }else{
                    list.add(tmpStr[i]);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                builder.append(result[i]);
                builder.append(" ");
            }
            System.out.println(builder.substring(0,builder.length()-1));
        }
    }
}
