package practice;
//二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
//对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
//( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
//小易想知道最多可以放多少块蛋糕在网格盒子里。
import java.util.Scanner;
//把所有的行和列排成一行(与原来等价) 那么问题就变成了将蛋糕每隔一个空放一个 可以多少
public class CakeNum {
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
