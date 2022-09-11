package com.demo;

import java.util.Scanner;

public class Test113Old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            int result = lengthOfLongestSubstring(line);
            System.out.println(result);

        }

    }
    public static int lengthOfLongestSubstring(String str) {
        String tmpStr = "";
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char tmp =  str.charAt(j);
                if(!tmpStr.contains(String.valueOf(tmp))){
                    tmpStr += tmp;
                    count++;
                }else{
                    tmpStr = "";
                    break;
                }
            }
            max = Math.max(max,count);
            count = 0;
        }
        return max;
    }
}
