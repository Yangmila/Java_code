package homework;
//把所有的行和列排成一行(与原来等价) 那么问题就变成了将蛋糕每隔一个空放一个 可以多少
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            int count = 0;

            if(W % 4 == 0 || H % 4 == 0){
                count = W * H / 2;//如果能整除4 那么蛋糕个数为网格个数的一半
            }else {
                count = W * H / 2 + 1;//不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
            }
            System.out.println(count);
        }
    }
}
