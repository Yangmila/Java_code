package practice;
//最小众倍数
//给定5个正整数, 它们的最小的众倍数是指的能够被其中至少三个数整除的最小正整数。
// 给定5个不同的正整数, 请计算输出它们的最小众倍数。
import java.util.Scanner;

public class SmallZongBeiNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arrs=new int[5];
        for(int i=0;i<5;i++){
            arrs[i]=sc.nextInt();
        }
        getResult(arrs);
    }

    private static void getResult(int[] arrs) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++){
                for(int k=j+1;k<5;k++){
                    res=Math.min(res, fun(arrs[i],arrs[j],arrs[k]));
                }
            }
        }
        System.out.println(res);
    }

    //求三个数的最小公倍数
    private static int fun(int i, int j, int k) {
        return fun3(fun3(i,j),k);
    }

    //求两个数的最小公倍数,穷举法
    private static int fun2(int i, int j) {
        int m=Math.max(i, j);
        int temp=i*j;
        for(int k=m;k<temp;k++){
            if(k%i==0&&k%j==0){
                return k;
            }
        }
        return temp;
    }

    //最小公倍数=两数相乘/最大公约数
    private static int fun3(int i,int j){
        return i*j/gcd(i,j);
    }

    //gcd求最大公约数
    private static int gcd(int i, int j) {
        return j==0?i:gcd(j, i%j);
    }
}
