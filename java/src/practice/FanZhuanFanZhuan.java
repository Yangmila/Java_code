package practice;
//翻转翻转
//给定一个N*M的矩阵，在矩阵中每一块有一张牌，我们假定刚开始的时候所有牌的牌面向上。
//现在对于每个块进行如下操作：
//> 翻转某个块中的牌，并且与之相邻的其余八张牌也会被翻转。
//XXX
//XXX
//XXX
//如上矩阵所示，翻转中间那块时，这九块中的牌都会被翻转一次。
//请输出在对矩阵中每一块进行如上操作以后，牌面向下的块的个数。
import java.util.Scanner;
//如果N == 1, M == 1，则只翻转一次，输出0;
//如果N == 1, M > 1， 则首尾被翻转2次，其它 M - 2 个被翻转三次，输出 M - 2;
//如果N > 1, M > 1, 则矩阵的四个角被翻转4次，四条边上除角以外的部分被翻转6次，不在边上的部分会被翻转9次，所以输出 (N - 2) * (M - 2)。
public class FanZhuanFanZhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            for (int i = 1; i < n; i++) {
                long A1 = scanner.nextLong();
                long A2 = scanner.nextLong();
                long ret;

                if (A1 == 1 && A2 == 1){
                    ret = 1;
                }else if (A1 == 1){
                    ret = A2 - 1;
                }else if (A2 == 1){
                    ret = A1 - 1;
                }else {
                    ret = (A1 - 2) * (A2 - 2);
                }
                System.out.println(ret);
            }
        }
    }
}
