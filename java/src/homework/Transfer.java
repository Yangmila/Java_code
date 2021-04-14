package homework;

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int tm = scanner.nextInt();
            String ret = transfer(num,tm);
            System.out.println(ret);
        }
    }

    public static String transfer(int num,int tm){
        StringBuffer str = new StringBuffer();
        String hex = "0123456789ABCDEF";
        boolean flag = true;

        if(num == 0){
            System.out.println(0);
        }
        if(num < 0){
            num = -num;
            flag = false;
        }

        while(num != 0){
            str.append(hex.charAt(num % tm));
            num = num / tm;
        }
        return flag == true ? str.reverse().toString():"-"+str.reverse().toString();
    }
}
