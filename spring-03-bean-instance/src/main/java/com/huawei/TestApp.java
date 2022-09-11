package com.huawei;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 6:29 PM
 */
public class TestApp {
    public static void main(String[] args) {
        String order = TestApp.order("g3ood 4of th5e pe6ople Fo1r the2 ");
        System.out.println(order);
        int solution = TestApp.solution("aa_bb_cc_dd_bb_e", "bb", true);
        System.out.println(solution);
    }

    // 请按你的实际需求修改参数
    public static String order(String words) {
        String[] tempStr  = words.split(" ");
        ArrayList tempList =   new ArrayList<String>();
        for(int i = 0; i < tempStr.length ; i++ ){
            tempList.add(tempStr[i]);
        }
        ArrayList resultList = new ArrayList<String>();
        for(int i = 1; i < 10 ; i++ ){
            for( int j = 0 ; j < tempList.size(); j++   ) {
                Pattern pattern = Pattern.compile(String.valueOf(i));
                Matcher matcher = pattern.matcher((CharSequence) tempList.get(j));
                if(matcher.find()){
                    resultList.add(tempList.get(j));
                }
            }

        }
        StringBuilder wordsStr = new StringBuilder();
        for(int k = 0 ; k < resultList.size(); k++ ){
            wordsStr.append(resultList.get(k));
            wordsStr.append(" ");
        }
        // 在这⾥写代码
        return  wordsStr.toString();
    }

    public static int solution(String fullText, String searchText, Boolean allowOverlap) {
        // 在这⾥写代码
        int count = 0 ;
        for (int i = 0; i < fullText.length(); i++) {
            for (int j = i+searchText.length(); j <= fullText.length(); j++) {
                if(allowOverlap){
                    String substring = fullText.substring(i, j);
                    if(substring.equals(searchText)){
                        count ++;
                    }
                }else{
                    String substring = fullText.substring(i, j);
                    if(substring.equals(searchText)){
                        count ++;
                        i+=substring.length();
                    }
                }
            }

        }
        return count;
    }


}
