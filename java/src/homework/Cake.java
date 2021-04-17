package homework;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            int count = 0;

            if(W % 4 == 0 || H % 4 == 0){
                count = W * H / 2;
            }else {
                count = W * H / 2 + 1;
            }
            System.out.println(count);
        }
    }
}
