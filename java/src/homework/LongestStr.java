package homework;

import java.util.Scanner;

//两个字符串的最长公共字符串
public class LongestStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String A = scanner.next();
            String B = scanner.next();
            String max = null;
            String max_str = null;
            String min_str = null;

            if(A.length() == B.length()){
                max_str = A;
                min_str = B;
            }else if(A.length() > B.length()){
                max_str = A;
                min_str = B;
            }else{
                max_str = B;
                min_str = A;
            }
            int index = 0;
            for(int x = min_str.length();x >= 0;x--){
                int b = x;
                boolean flag = false;
                for(int y = 0;y <= min_str.length()-x;y++){
                    index++;
                    int v = y;
                    String wait_max = min_str.substring(v, b);
                    if(max_str.contains(wait_max)){
                        max = wait_max;
                        flag = true;
                        break;
                    }
                    b++;
                }
                if(flag){
                    break;
                }
            }
            System.out.println(max.length());
        }
    }
}
