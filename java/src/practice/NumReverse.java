package practice;
//数字翻转
//对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
//如果 X = 123，则rev(X) = 321;
//如果 X = 100，则rev(X) = 1.
//现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(rev(rev(x) + rev(y)));
        }
    }

    public static int rev(int n){
        int ret = 0;
        while (n != 0){
            ret = ret * 10 + n % 10;
            n /= 10;
        }
        return ret;
    }
}
