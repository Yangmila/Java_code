package homework;
//斐波那契凤尾
import java.util.Scanner;

public class FibFengWei {
    static int[] fib = new int[100001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            fib[0] = 1;
            fib[1] = 1;
            System.out.printf((n<25?"%d\n":"%06d\n"), getFibonacci(n));
        }
    }

    public static int getFibonacci(int n) {
        if (fib[2] == 0) {
            for (int i = 2; i <100001; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1000000;
            }
        }
        return fib[n];
    }
}
