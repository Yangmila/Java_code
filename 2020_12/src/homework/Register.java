package homework;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        String password = "123";
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("请输入密码: ");
            String input = scanner.next();
            if (input.equals(password)) {
                System.out.println("密码正确, 登陆成功");
            } else {
                System.out.println("密码错误, 请重新输入");
            }
        }
        if (i == 3) {
            System.out.println("您已经连续失败 3 次, 系统强制退出");
        }
    }
}

