import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String target = sc.nextLine();
            String source = sc.nextLine();
            int index = -1;
            int p = source.length()-1 ;
            for (int i = target.length() - 1 ; i >= 0  ; i--) {
                boolean flag = true ;
                for (int j = p ; j >= 0;  j-- , p--) {
                    if(target.charAt(i) == source.charAt(j)){
                        if(i == 0){
                            index = j ;
                        }
                        flag = false;
                        break;
                    }
                }
                if(flag) break;
            }
            System.out.println(index);
        }
    }
}
