package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/9/2022 4:33 PM
 */
public class Test1002 {
    private static int[] constRow = { -1 , 1 , 1 , -1  };
    private static int[] constCol = { 1 , -1 , 1 , -1  };
    private static int maxVal = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int num = Integer.parseInt(sc.nextLine());
            int[] result = new int[num];
            int count = 0 ;
            while (num  > 0 ){
                maxVal = -1;
                num--;
                count ++;
                String[] strNum = sc.nextLine().split(" ");
                int row = Integer.parseInt(strNum[0]);
                int col = Integer.parseInt(strNum[1]);

                ArrayList<String[]> curList = new ArrayList<>();
                for (int i = 0; i < row; i++) {
                    String[] tmpStr = sc.nextLine().split(" ");
                    if(tmpStr.length < col){
                        String[] tmp = new String[col];
                        for (int j = 0; j < tmpStr.length; j++) {
                            tmp[j] = tmpStr[j];
                        }
                        tmpStr =tmp;
                    }
                    curList.add(tmpStr);
                }

                for (int i = 1; i <= num; i++) {
                    tmpSolutionHander(curList,num);
                }
                result[count] = maxVal;
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                builder.append(result[i]);
                builder.append(" ");
            }
            System.out.println(builder.substring(0,builder.length()-1));
        }
    }

    private static void tmpSolutionHander(ArrayList<String[]> curList, int num) {
        int sum = 0;
        for (int i = 0; i < curList.size(); i++) {
            for (int j = 0; j < curList.get(i).length; j++) {
                sum += Integer.parseInt(curList.get(i)[j]);
            }
        }
        maxVal = sum;
    }
}
