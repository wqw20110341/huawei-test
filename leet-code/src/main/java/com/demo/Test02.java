package com.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(",");
            int num = Integer.parseInt(scanner.nextLine());
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < line.length; i++) {
                hashMap.put(Integer.parseInt( line[i]) , i );
            }
            int[]  resultList = new int[2];
            for (int i = 0; i < line.length; i++) {
                int tmp = Integer.parseInt(line[i]);
                int sub = num - tmp;
                if(hashMap.containsKey(sub)&&hashMap.get(sub)!=tmp){
                    resultList[0] = hashMap.get(tmp);
                    resultList[1] = hashMap.get(sub);
                    break;
                }
            }
            System.out.println(resultList[0] + ":" +resultList[1]);
        }
    }
}
