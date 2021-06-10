package practice;
//构造队列https://www.nowcoder.com/practice/657d09e2b3704574814089ba8566d98d?tpId=182&tags=&title=&difficulty=0&judgeStatus=0&rp=1
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 思想：先使用一个1到n的数组模拟小明的操作，
 * 然后会得到一组输出，例如：3,5,10,7....
 * 按题意是应该输出   1,2,3,4....
 * 这样，我们就可以反推出
 * 1应该在第3个位置
 * 2应该在第5个位置
 * 3应该在第10个位置
 * 4应该在第7个位置
 * ....
 * Created by hzlizhou on 2016/9/8.
 */
public class CreateQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number-->0){
            int n = scanner.nextInt();
            helper(n);
        }
    }

    public static void helper(int n) {
        //生成一个1-n的数组
        LinkedList<Integer> original = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            original.addLast(i);
        }

        //模拟过程
        LinkedList<Integer> res = new LinkedList<Integer>();
        while (!original.isEmpty()) {
            int x = original.removeFirst();
            original.addLast(x);
            x = original.removeFirst();
            res.addLast(x);
        }

        //反推出正确位置，放入out数组中
        int[] out = new int[n];
        for (int i = 1; i <= n; i++) {
            int x = res.removeFirst();
            out[x - 1] = i;
        }

        //输出out数组
        System.out.print(out[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" "+out[i]);
        }
        System.out.println();
    }
}
