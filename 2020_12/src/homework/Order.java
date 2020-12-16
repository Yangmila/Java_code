package homework;

import java.util.Scanner;

public class Order {
    public static void num(int m){
            int count = 0;
            int a[] = new int[32];
            int i = 0;

            while (m>0) {
                a[i++] = m % 2;
                m /= 2;
                count++;
            }

            System.out.println("奇数序列");
            for (i = count; i >= 0; i -= 2) {
                System.out.print(a[i]+" ");
            }
            System.out.println();

            System.out.println("偶数序列");
            for (i = count - 1; i >= 0; i -= 2) {
                System.out.print(a[i]+" ");
            }
        System.out.println();
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        num(m);
    }
}
