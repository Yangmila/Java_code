package homework;

import java.util.Scanner;

public class IsReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String A = scanner.next();
            String B = scanner.next();
            System.out.println(isReverse(A,B));
        }
    }

    public static int isReverse(String A,String B){
        int count = 0;
        int len = A.length();
        for(int i = 0;i <= len;i++){
            String str=A.substring(0,i)+B+A.substring(i,len);
            if(isHuiWen(str)){
                count++;
            }
        }
        return count;
    }

    public static boolean isHuiWen(String str) {
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
