import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                list.add(Integer.parseInt(str[i]));
            }
            ArrayList<int[]> tempList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j <list.size() ; j++) {
                    int[]  temp = new int[]{list.get(i),list.get(j)};
                    tempList.add(temp);
                }
            }
            Collections.sort(tempList,((o1, o2) -> {
                int tmp1 =Math.abs(o1[0]+o1[1]) ;
                int tmp2 =Math.abs(o2[0]+o2[1]) ;
                return tmp1 - tmp2;
            }));
            int[] result = tempList.get(0);
            int min = Math.min(result[0],result[1]);
            int max = Math.max(result[0],result[1]);
            System.out.println(min +" " + max + " " + Math.abs(min+max));
        }
    }
}
