package homework;

import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int up;
        int down;
        if (num % 2 != 0){
            up = 1 + num / 2;
            down = num - up;
            oddNum(up,down);
        }
        else{
            up = num / 2;
            down = num - up;
            evenNum(up,down);
        }
    }

    public static void oddNum (int up,int down) {

        for(int i = 1; i <= up; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 2 * (up - i) - 1; k > 0; k--){
                System.out.print(" ");
            }
            if ( i != up){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= down; i++){
            for (int j = down - i ; j > 0 ; j--){
                System.out.print(" ");
            }
            System.out.printf("*");
            for (int k = 1; k <= 2 * i - 1; k++ ){
                System.out.printf(" ");
            }
            System.out.println("*");

        }
    }

    public static void evenNum (int up,int down) {

        for(int i = 1; i <= up; i++) {
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 2 * (up - i); k > 0; k--){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= down; i++){
            for (int j = down - i ; j > 0 ; j--){
                System.out.print(" ");
            }
            System.out.printf("*");
            for (int k = 2 * ( i - 1 ); k > 0 ; k--){
                System.out.printf(" ");
            }
            System.out.println("*");

        }
    }
}
