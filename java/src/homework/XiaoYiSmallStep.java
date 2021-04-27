package homework;

import java.util.Arrays;
import java.util.Scanner;

//跳石板
public class XiaoYiSmallStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            //状态数组
            int[] step = new int[M+1];
            //填充最大值
            Arrays.fill(step,Integer.MAX_VALUE);
            //设置开始值为0，让程序开始
            step[N] = 0;
            for(int i =N; i<=M;i++){
                //不可达点跳过
                if(step[i] == Integer.MAX_VALUE) {
                    continue;
                }
                //求约数
                for(int j=2; (j*j)<=i;j++){
                    if(i%j==0){
                        //小的约数
                        if(i+j <= M){
                            step[i+j] = Math.min(step[i]+1,step[i+j]);
                        }
                        //与J对应的大的约数
                        if(i+(i/j) <= M){
                            step[i+(i/j)] = Math.min(step[i]+1,step[i+(i/j)]);
                        }
                    }
                }
            }
            //最终仍然不可达，设置值为-1
            if(step[M] == Integer.MAX_VALUE){
                step[M] = -1;
            }
            //输出
            System.out.println(step[M]);
        }
    }
}
