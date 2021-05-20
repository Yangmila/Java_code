package homework;

import java.util.Scanner;

//猴子分桃
/**
 * 思路：因为每次分5堆都会多出来1个，所以我们借给猴子们4个，以致每次都可以刚好分成5堆
 *     并且，每次给老猴子的桃子都不在我们借出的那4个中，这样最后减掉4就可以得到结果。
 *   假设最初由x个桃子，我们借给猴子4个，则此时有x+4个，
 *   第一个猴子得到（x+4）/5，剩余（x+4）*（4/5）个
 *   第二个猴子分完后剩余（x+4）*(4/5)^2个
 *   第三个猴子分完后剩余（x+4）*(4/5)^3个
 *   依次类推，最后一个猴子分完后剩余（x+4）*（4/5）^n
 *   要满足最后剩余的为整数，并且x最小，则当 x+4=5^n时，满足要求
 *   此时，x=5^n-4;
 *   老猴子得到的数量为：old = （x+4）*（4/5）^n + n - 4
 *                     = 4^n + n - 4
 *   最后加n是因为不是剩余多出来的一个，而是小猴子给的，比如桃子是有6个，小猴子本身只能拿一个，我们借给4个，小猴就能拿两个，那多出来的哪一个给老猴子，和之前6个整除五余1一个道理
 *   最后老猴子减4是还给我们借给它们的那4个
 *
 */
public class Monkey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            long n = scanner.nextInt();
            if(n == 0){
                break;
            }else {
                System.out.println(((long)Math.pow(5,n) - 4) + " " + ((long)Math.pow(4,n) + n - 4));
            }
        }
    }
}
