package homework;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        return n < 2 ? n:fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }
}
