package dailyOneprobleme;

//年会抽奖
import java.util.Scanner;

//解析：
//本题求解需要求出所有可能的抽奖情况，及所有人都不中奖时的情况，两者相除即为所得。这里主要牵扯到了一个错排问题。
//
//错排问题： n个有序的元素应有n!个不同的排列，如若一个排列使得所有的元素不在原来的位置上，则称这个排列为错排；有的叫重排。
//
//求错排问题的递推关系，分两步走：
//第一步，考虑第n个元素，把它放在某一个位置，比如位置k，一共有n-1种放法；
//第二步，考虑第k个元素，这时有两种情况：
//（1）把它放到位置n，那么对于除n以外的n-1个元素，由于第k个元素放到了位置n，所以剩下n-2个元素的错排即可，有Dn-2种放法；
//（2）第k个元素不放到位置n，这时剩下的这n-1个元素错排就好了，有Dn-1种放法。(如果位置n不放第k个元素，那么我们就可以把第k个元素当作是原来的第n个元素，相当于n-1个元素错排)
//综上得到:
//Dn=(n -1)(Dn-1+Dn-2)
public class NianHuiChouJiang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            float sum1 = factorial(num);
            float sum2 = count(num);
            //将得到的分子分母进行相除，就可以得到概率了。
            float ret = (sum2 / sum1) * 100;
            System.out.println(String.format("%.2f%%", ret) );        }
    }

    //错排算法
    public static float count(int num) {
        if (num == 1){
            return 0;
        }else if (num == 2){
            return 1;
        }else {
            return (num - 1) * (count(num - 1) + count(num - 2));
        }
    }

    //n的阶乘
    public static float factorial(int num) {
        float ret = 1;
        if(num == 0){
            return 1;
        }else if(num > 0){
            ret = num * factorial(num - 1);
        }
        return ret;
    }
}
