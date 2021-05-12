package homework;

import java.util.Scanner;

//小易的升级之路
public class XiaoYiGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int init = scanner.nextInt();
            int[] monster = new int [n];
            for(int i = 0;i < n;i++) {
                monster[i] = scanner.nextInt();
                if(init > monster[i]) {
                    init += monster[i];
                }
                else {
                    init += gcd(init,monster[i]);
                }
            }
            System.out.println(""+init);
        }
    }

    public static int gcd(int n,int m) {
        if(m%n==0)
            return n;
        else {
            return gcd(m%n,n);
        }
    }
}
