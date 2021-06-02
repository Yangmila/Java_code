package practice;

import java.util.Scanner;
//分苹果
//1 累加苹果数要能被n整除
//2 每一堆苹果数目和最终苹果数奇偶性要一样
//3 操作数就是累加每一堆大于最终苹果数，然后除以2
public class FenApples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] naiNiu = new int[n];
            int sum = 0;
            for(int i = 0;i < n;i++){
                naiNiu[i] = scanner.nextInt();
                sum += naiNiu[i];
            }

            if(sum % n != 0){
                System.out.println("-1");
                return;
            }

            int apples = sum / n;
            int count = 0;
            for(int i = 0;i < n;i++){
                if(Math.abs(naiNiu[i] - apples) % 2 == 1){
                    System.out.println("-1");
                    return;
                }
                if(naiNiu[i] > apples){
                    count += naiNiu[i] - apples;
                }
            }
            System.out.println(count / 2);
        }
    }
}
