package practice;

import java.util.Scanner;

public class TongJiHuiWen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            int count = 0;
            int len = str1.length();
            for(int i = 0;i <= len;i++){
                String str = str1.substring(0,i) + str2 + str1.substring(i,len);
                if (isReserve(str)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isReserve(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
