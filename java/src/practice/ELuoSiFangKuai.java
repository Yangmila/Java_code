package practice;
//俄罗斯方块
//荧幕上一共有 n 列，每次都会有一个 1 x 1 的方块随机落下，
//在同一列中，后落下的方块会叠在先前的方块之上，当一整行方块都被占满时，这一行会被消去，并得到1分。
import java.util.Arrays;
import java.util.Scanner;
//分析：
//由于整个屏幕有n列，那么如果想要得分的话就要从第1列到第n列都要有值才能得分，那么我们只需要对每个方块落在第几列进行计数，然后从第1列一直循环到第n列，判断哪列的计数值最小，最小值就是答案，输出即可。
//举个例子:
//3 6
//1 2 3 1 1 2
//上例表示一共有三列，6个1*1的方块，那么我们统计一下每一列的方块数：
//第一列：有3个（数字1有三个）
//第二列：有2个（数字2有二个）
//第三列：有1个（数字3有一个）
//所以以每列的个数最小值为最终答案，即小易能够得1分。
//算法实现：
//(0). 输入x，用一个数组用来计数a[x]++
//(1). 从第1列遍历到第n列，找到计数数组的最小值
//(2). 输出最终最小值结果
public class ELuoSiFangKuai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < m; i++) {
                int tmp = scanner.nextInt();
                arr[tmp - 1]++;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
    }
}
