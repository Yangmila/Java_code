package homework.booksystem;

import homework.booksystem.soperation.*;

import java.util.Scanner;

public class NormalUser extends User{
    NormalUser(String name){
        this.name = name;
        this.operations = new SOperation[] {
                new Find(),
                new Borrow(),
                new Return(),
                new Exit()
        };
    }
    @Override
    public int menu() {
        System.out.println("*********************************");
        System.out.println("您好! " + name + ", 欢迎使用图书管理系统");
        System.out.println(" 1. 查阅图书信息");
        System.out.println(" 2. 借阅图书");
        System.out.println(" 3. 归还图书");
        System.out.println(" 4. 显示图书列表");
        System.out.println(" 5. 退出该系统");
        System.out.println("*********************************");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
