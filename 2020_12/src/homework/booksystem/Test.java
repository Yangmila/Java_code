package homework.booksystem;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();

        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名: ");
        String name = scanner.next();
        System.out.println("请输入您的身份: 1 管理员, 0 普通用户");
        int who = scanner.nextInt();
        if (who == 1) {
            return new Manager(name);
        }
        return new NormalUser(name);
    }
}
