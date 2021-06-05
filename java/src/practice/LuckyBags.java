package practice;

import java.util.Arrays;
import java.util.Scanner;
//幸运袋子
//一个袋子里面有n个球，每个球上面都有一个号码(拥有相同号码的球是无区别的)。如果一个袋子是幸运的当且仅当所有球的号码的和大于所有球的号码的积。
//例如：如果袋子里面的球的号码是{1, 1, 2, 3}，这个袋子就是幸运的，因为1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
//你可以适当从袋子里移除一些球(可以移除0个,但是别移除完)，要使移除后的袋子是幸运的。现在让你编程计算一下你可以获得的多少种不同的幸运的袋子。
public class LuckyBags {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] x = new int[n];
            for(int i = 0;i < n;i++){
                x[i] = scanner.nextInt();
            }
            Arrays.sort(x);
            System.out.println(find(x,0,0,1));
        }
    }

    public static int find(int[] x,int index,long sum,long mutil){
        int count = 0;
        for(int i = index;i < x.length;i++){
            sum += x[i];//求和
            mutil *= x[i];//求积
            if(sum > mutil){
                count += 1 + find(x,i + 1,sum,mutil);//继续遍历下一个数
            }else if(x[i] == 1){//若arr[i]=1，1和任何数的和>1和任何数的积
                count += find(x,i + 1,sum,mutil);
            }else{
                break;//说明不构成幸运，直接break
            }
            //回溯
            sum -= x[i];
            mutil /= x[i];
            //因为相同的无区别，跳过重复的号码
            while(i < x.length - 1 && x[i] == x[i + 1]){
                i++;
            }
        }
        return count;
    }
}
