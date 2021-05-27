package dailyOneprobleme;

import java.util.Scanner;

//剪花布条
public class JianHuaBuTiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.next();
            String t = scanner.next();
            int count = 0;
            int n = s.indexOf(t,0);
            while (n < s.length() && n != -1){
                count++;
                n += t.length();
                n = s.indexOf(t , n);
            }
            System.out.println(count);
        }
    }
}
