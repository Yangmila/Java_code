package homework;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] num = new int[n];
            for(int i = 0;i < n;i++){
                num[i] = scanner.nextInt();
            }
            maxArray(num,n);
        }
    }

    public static void maxArray(int[] num, int n) {
        int max = num[0];
        int sum = num[0];
        for(int i =0;i < n;i++){
            if(sum >= 0){
                sum += num[i];
            }else {
                sum = num[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
