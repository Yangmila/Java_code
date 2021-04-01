package homework;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int ret =1;
        if(n==0){
            ret = 1;
        }else {
            for (int i = 1; i <= n; i++) {
                ret *= i;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(n+"!="+factorial(n));
    }
}
