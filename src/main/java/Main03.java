import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            boolean isStart = line.startsWith("1");
            boolean isEnd = line.endsWith("1");
            String[] tmpStr = line.split("00");
            ArrayList<String> tmpList =  new ArrayList<>();
            for (int i = 0; i < tmpStr.length; i++) {
                Msg msg =  checkWaveHandler(tmpStr[i] ,(isStart && i == 0 )||( i == tmpStr.length -1 && isEnd));
                if(msg.flag){
                    tmpList.add(msg.getStr());
                }
            }
            Collections.sort(tmpList,((o1, o2) -> o2.length() - o1.length()));
            if(tmpList.size() > 0 ){
                System.out.println(tmpList.get(0));
            }else{
                System.out.println(-1);
            }

        }

    }
    private static Msg checkWaveHandler(String str, boolean isStartAndEnd) {
        Msg msg = new Msg();
        msg.flag = false;
        if(!isStartAndEnd) {
            if (str.startsWith("1")) {
                str = "0" + str;
            }
            if (str.endsWith("1")) {
                str = str + "0";
            }
        }
        if(str.contains("00")||str.contains("11")){
            msg.flag  = false;
        }else if(str.contains("01010") ){
            msg.flag  =true;
        }
        if(str.startsWith("1")||str.endsWith("1")){
            msg.flag  = false;
        }
        msg.setStr(str);
        return  msg;
    }

    private static class Msg{
        private boolean flag ;
        private String str;

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

}
