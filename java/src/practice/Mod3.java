package practice;
//被3整除
//小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
//并且小Q对于能否被3整除这个性质很感兴趣。
//小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
import java.util.Scanner;
//每三个数中有两个能被3整除，所以我们可以把数字按成多份，每份有3个，每3个中有2个能被3整除。就是n/3*2这个式子。
// 分完之后，再对多余部分进行分析，余数为0，那么直接返回结果，余数为1，看表格也是直接返回结果，余数为2，会多一种情况。
//最后算出1到r的结果，减去1到l的结果，得到l到r的结果。
public class Mod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            System.out.println(cal(r) - cal(l - 1));
        }
    }

    public static int cal(int n) {
        int sum = n / 3 * 2;
        if (n % 3 == 2){
            return sum + 1;
        }else {
            return sum;
        }
    }
}
