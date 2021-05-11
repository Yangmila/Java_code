package homework;

import java.util.ArrayList;
import java.util.Scanner;

//洗牌
public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int m = 0;m<T;m++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[2*n];
            for(int i = 0;i<2*n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i<k;i++){
                method(a,2*n);
            }
            for (int i = 0; i < n * 2 - 1; i ++) {
                System.out.print(a[i] + " ");
            }
            System.out.println(a[n * 2 - 1]);
        }
    }
    public static void method(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n / 2; i ++) {
            list.add(a[i]);
            list.add(a[i + n / 2]);
        }
        for (int i = 0; i < n; i ++) {
            a[i] = list.get(i);
        }
    }
}
