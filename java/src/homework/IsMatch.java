package homework;
//字符串通配符
import java.util.Scanner;

public class IsMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String zhengze = sc.next();
            String s = sc.next();
            zhengze = zhengze.replaceAll("\\?","[\\\\w]{1}");
            zhengze = zhengze.replaceAll("\\*","[\\\\w]*");
            System.out.println(s.matches(zhengze));
        }
    }
}
