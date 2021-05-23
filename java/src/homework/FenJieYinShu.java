package homework;

import java.util.Scanner;

//分解因数
//思路：1.循环从2开始找到第一个可以整除的素数，找到后跳出循环
//        2.在该数大于等于2的条件下，从2开始循环找到剩余可以整除的素数
public class FenJieYinShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int i = 0;
            System.out.print(num + " " + "=");
            i = 2;
            while (true){
                if(num % i == 0){
                    System.out.print(" " + i);
                    num /= i;
                    break;
                }
                ++i;
            }
            while (num >= 2){
                i = 2;
                while (true){
                    if(num % i == 0){
                        System.out.print(" " + "*" + " ");
                        System.out.print(i);
                        num /= i;
                        break;
                    }
                    ++i;
                }
            }
            System.out.println();
        }
    }
}
