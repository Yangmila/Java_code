package homework;
//完全数计算

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            int count = 0;
            for(int i = 1; i <= num; i++) {
                int sum = 0;
                for(int j = i-1; j > 0; j--) {
                    if(i % j == 0) {
                        sum += j;
                    }
                }
                if(sum == i) {
                    count++;
                }
            }
                System.out.println(count);
        }
    }
}
