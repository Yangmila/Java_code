package practice;
//操作序列
//小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
//1、将a_i放入b序列的末尾
//2、逆置b序列
//小易需要你计算输出操作n次之后的b序列。
import java.util.Scanner;
//当n为奇数时，先从后向前输出奇数位置的数字，再从前向后输出偶数位置的数字
//当n为偶数时，先从后向前输出偶数位置的数字，再从前向后输出奇数位置的数字
public class OprationList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            if (n == 1){
                System.out.println(arr[0]);
            }
            if (n % 2 == 0){
                for (int i = n - 1; i >= 0; i -= 2) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i < n - 2; i += 2) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print(arr[n - 2]);
            }else {
                for (int i = n - 1; i >= 0 ; i -= 2) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 1; i < n - 2; i += 2) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print(arr[n - 2]);
            }
        }
    }
}
