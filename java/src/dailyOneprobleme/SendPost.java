package dailyOneprobleme;
import java.util.Scanner;
//发邮件
//用的是单步最优的考虑想法，从最后一步开始考虑。
//错排问题，推导如下,
//        若前n-1个数已经满足错排，现考虑第n个数：
//        （1）第n个数可以和前n-1个中任意一个数互换，结果仍然是错排，所以有(n-1)*D(n-1)种；
//        （2）第n个数可以放到前n-1任意一个位置，但是原来位置的数不能放到最后，
//        则其只可以能放在其他n-2个位置，并且保证这n-2的位置是错排，所以有(n-1)*D(n-2)
//
//        综上，一共有 D(n) =（n-1）*(D(n-1)+D(n-2))

public class SendPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long sum = count(n);
            System.out.println(sum);
        }

    }

    //计算所有人都收不到自己的邮件的情况情况：错排算法
    private static long count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }
}
