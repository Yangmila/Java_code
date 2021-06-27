package homework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("当前年龄的人是少年");
        } else {
            if (age > 18 && age <= 28) {
                System.out.println("当前年龄的人是青年");
            } else {
                if (age > 28 && age <= 55) {
                    System.out.println("当前年龄的人是中年");
                } else {
                    System.out.println("当前年龄的人是老年");
                }
            }
        }
    }
}
