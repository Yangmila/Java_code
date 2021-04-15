package homework;

import java.util.Arrays;
import java.util.Scanner;

public class NiuNiu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] b = new int[3 * n];
            for(int i = 0;i < 3 * n;i++){
                b[i] = in.nextInt();
            }
            Arrays.sort(b);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += b[b.length - 2 * (i + 1)];
            }
            System.out.println(sum);
        }
    }
}
