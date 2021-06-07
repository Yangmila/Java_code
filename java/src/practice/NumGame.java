package practice;
//数字游戏
import java.util.Arrays;
import java.util.Scanner;
//每次小易会任意说一个数字出来，然后你需要从这一系列数字中选取一部分出来让它们的和等于小易所说的数字。
// 例如： 如果{2,1,2,7}是你有的一系列数，小易说的数字是11.你可以得到方案2+2+7 = 11.
// 如果顽皮的小易想坑你，他说的数字是6，那么你没有办法拼凑出和为6
// 现在小易给你n个数，让你找出无法从n个数中选取部分求和的数字中的最小数（从1开始）。
public class NumGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int ret = 0;
            for(int i = 0;i < n;i++){
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            for(int i = 0;i < n;i++){
                if(nums[i] > ret + 1){
                    break;
                }
                ret += nums[i];
            }
            System.out.println(ret + 1);
        }
    }
}
