package homework;

import java.util.Scanner;

public class digFactorial {
    public static int fac(int n){
        if(n == 1){
            return n;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }
}
