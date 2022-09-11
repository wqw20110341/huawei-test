package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 4:02 PM
 */
public class MainTest1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int num = Integer.parseInt(sc.nextLine());
            ArrayList<String[]> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(sc.nextLine().split(" "));
            }
            for (int i = 0; i < num; i++) {
                String result = tempHandler(list.get(i));
                System.out.println(result);
            }
        }
    }

    private static String tempHandler(String[] tmpList) {
        int n = Integer.parseInt(tmpList[0]);
        int x = Integer.parseInt(tmpList[1]);
        int y = Integer.parseInt(tmpList[2]);
        int k = Integer.parseInt(tmpList[3]);
        double Mei = (1.0/x) * k;
        double friend = (1.0/y) * (n-k+1);
        if(Mei== friend){
            return "Tie";
        }else if(Mei > friend){
            return "Lose";
        }else{
            return "Win";
        }
    }
}
