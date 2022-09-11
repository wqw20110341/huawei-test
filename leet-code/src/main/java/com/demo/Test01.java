package com.demo;

import java.util.*;

/**
 * 给定一个字符串 s 和一些 长度相同 的单词 words 。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符 ，但不需要考虑 words 中单词串联的顺序。
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = new String[]{"fooo","barr","wing","ding","wing"};
            List<Integer> result = findSubstring(line,words);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i)+" ");
            }
            System.out.println("------------");
        }

    }
    public static List<Integer> findSubstring(String str, String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<String> iterator = Arrays.stream(words).iterator();
        int len = 0;
        int limit = words[0].length();
        ArrayList<String> wordList = new ArrayList<>();
        while (iterator.hasNext()){
            String next = iterator.next();
            wordList.add(next);
            len += next.length();
        }
        for (int i = 0; i <= str.length()-len; i++) {
            String tmpStr = str.substring(i,i+len);
            ArrayList<String> tmpList = new ArrayList<>(wordList);
            for (int j = 0; j < tmpStr.length(); j+=limit) {
                String substring = tmpStr.substring(j, j + limit);
                for (int k = 0; k < tmpList.size(); k++) {
                    if(tmpList.get(k).equals(substring)){
                        tmpList.remove(k);
                    }
                }
            }
            if(tmpList.size()==0) list.add(i);
        }
        return  list;
    }
}
