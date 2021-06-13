package practice;
//最大的奇约数
import java.util.Scanner;
/*
 * 奇数的最大约数就是本身。
 * 问题就是求所有f(i), i为偶数的和 因为要求的是最大奇约数，
 * 所以f(2k) = f(k)，所以f(2) + f(4)+ ... + f(2k) = f(1) + f(2) + ... + f(k);
 * sum(n) = sum (n / 2) + 1 + 3 + ... + n - 1 = sum (n/2) + n*n/4（n 为偶数）
 * 当n为偶数，就有n/2个奇数，根据等差数列求和公式 即(（首项+末项）*项数)/2,我们知道n/2个奇数和为((1+n-1)*n/2)/2,
 * 即为(n/2) * (n/2),此时n为偶数，因此 (n/2) * (n/2)
 *
 *         = sum (n - 1) + n （n为奇数）
 */
public class BestJiYueShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(sum(num));
        }
    }

    public static long sum(long num) {
        if (num == 1) {
            return 1;
        }
        if (num % 2 == 0){
            return sum(num / 2) + num * num / 4;
        }else {
            return sum(num - 1) + num;
        }
    }
}
