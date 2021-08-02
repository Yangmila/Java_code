package practice.jianzhioffer;
//剪绳子
//给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。
// 请问k[1]x...xk[m]可能的最大乘积是多少？
//例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
public class CutRope {
    public int cutRope(int target) {
        // 如果我们把长度为n的绳子分为x段，
        // 则每段只有在长度相等的时候乘积最大，
        // 那么每段的长度是n/x。他们的乘积是(n/x)^x.
        // 当x=n/e的时候，也就是每段绳子的长度是n/x=n/(n/e)=e的时候乘积最大。
        // 题中我们的绳子剪的长度都是整数，所以不可能取e，我们只能取接近e的值，也就是3的时候乘积最大。
        // 当n<=4的时候会有特殊情况，因为2*2>1*3。明白了这点代码就容易多了，如果n大于4，我们不停的把绳子减去3
        if(target == 2 || target == 3){
            return target - 1;
        }
        int res = 1;
        while (target > 4){
            target = target - 3;
            res *= 3;
        }
        return target * res;
    }
}
