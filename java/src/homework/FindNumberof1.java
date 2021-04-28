package homework;
//查找输入整数二进制中1的个数

import java.util.Scanner;

public class FindNumberof1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            String str = Integer.toBinaryString(num);
            int count = 0;
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) == '1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
