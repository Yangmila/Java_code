package homework;

import java.util.Scanner;

public class FibonacciSmallStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int f0 = 0;
            int f1 = 1;
            int f;
            int right = 0;
            int left = 0;

            while(true){
                f = f0 + f1;
                f0 = f1;
                f1 = f;

                if(f < N){
                    left = N - f;
                }else {
                    right = f - N;
                    break;
                }
            }
            System.out.println(Math.min(left,right));
        }
    }
}
