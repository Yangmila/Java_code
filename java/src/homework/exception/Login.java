package homework.exception;

import java.util.Scanner;

public class Login {
    public static String username;
    public static String password;
    public static void main(String[] args) throws PasswordException, NameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        login(username,password);
        System.out.println("登陆成功！");
    }

    public static void login(String username, String password) throws PasswordException, NameException {
        if(!Login.username.equals("hello")){
            throw new NameException("用户名错误！");
        }
        if(!Login.password.equals("abc")){
            throw new PasswordException("密码错误");

        }
    }
}
