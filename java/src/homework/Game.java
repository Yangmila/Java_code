package homework;

import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void game() {
        Random random = new Random();
        int toGuess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要猜的数字: ");
            int num = scanner.nextInt();
            if (num < toGuess) {
                System.out.println("低了");
            } else if (num > toGuess) {
                System.out.println("高了 ");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }

    public static int menu() {
        System.out.println("=====================");
        System.out.println(" 1. 开始游戏");
        System.out.println(" 0. 退出游戏");
        System.out.println("=====================");
        System.out.println(" 请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        while (true) {
            int choice = menu();

            if (choice == 1) {
                game();
            } else if (choice == 0) {
                System.out.println("goodbye!");
                break;
            } else {
                System.out.println("您的输入有误!");
                continue;
            }
        }
    }
}
