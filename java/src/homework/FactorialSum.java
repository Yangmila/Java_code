package homework;

import java.util.Scanner;

public class FactorialSum {
    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
    public static int sum(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += factorial(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(n+"!的和为："+sum(n));
    }
}
