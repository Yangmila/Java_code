package homework;
//统计每个月兔子的总数
import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int ret = getNum(num);
            System.out.println(ret);
        }
    }

    public static int getNum(int num) {
        int f1 = 1,f2 = 1;
        int f3 = 0;
        for(int i = 3;i <= num;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
