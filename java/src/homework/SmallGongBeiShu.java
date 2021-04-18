package homework;

import java.util.Scanner;

public class SmallGongBeiShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int tmp = smallGongBeiShu(A,B);
            System.out.println(tmp);
        }

    }

    public static int smallGongBeiShu(int a, int b) {
        int tmp = a * b / bigGongYueShu(a,b);
        return tmp;
    }

    public static int bigGongYueShu(int a, int b) {
        int temp = 0;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
