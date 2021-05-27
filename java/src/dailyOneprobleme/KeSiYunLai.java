package dailyOneprobleme;

import java.util.Scanner;

//客似云来
public class KeSiYunLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] fib = new long[81];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2;i < 81;i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        while (scanner.hasNext()){
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            long count = 0;

            for(int i = from - 1;i <to;i++){
                count += fib[i];
            }
            System.out.println(count);

        }
    }
}
