package practice.jianzhioffer;
//JZ9 跳台阶扩展问题
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
//求该青蛙跳上一个n级的台阶(n为正整数)总共有多少种跳法。
public class JumpFloorII {
    ////对于方法一中的：f[n] = f[n-1] + f[n-2] + ... + f[0]
    ////
    ////那么f[n-1] 为多少呢？
    ////
    ////f[n-1] = f[n-2] + f[n-3] + ... + f[0]
    ////
    ////所以一合并，f[n] = 2*f[n-1]，初始条件f[0] = f[1] = 1
    public int jumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        int ret = 1;
        for(int i = 2;i <= target;i++){
            ret *= 2;
        }
        return ret;
    }
}
