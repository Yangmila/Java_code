package homework;

import java.util.Scanner;

public class Suger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a_b = scanner.nextInt();
            int b_c = scanner.nextInt();
            int ab = scanner.nextInt();
            int bc = scanner.nextInt();

            int a = 0,b = 0,c = 0;
            a = (a_b + ab) / 2;
            b = (b_c + bc) / 2;
            c = bc - b;

            if((a - b == a_b) && (b - c == b_c) && (a + b == ab) && (b + c == bc)){
                System.out.println(a + " " + b+ " " + c);
            }else {
                System.out.println("No");
            }
        }
    }
}
