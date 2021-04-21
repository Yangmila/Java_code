package homework;

import java.util.Scanner;

public class Backward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            backward(n);
        }
    }

    public static void backward(int n) {
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            int num = n % 10;
            sb.append(num);
            n = n / 10;
        }
        System.out.println(sb.toString());
        return;
    }
}
