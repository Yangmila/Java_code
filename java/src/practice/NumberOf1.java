package practice;
//二进制中1的个数
//输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
//无用操作是，如果当前位是0， 还是会做判断，然后一位一位的移动。
//如果，给你一种超能力，你一下可以对从右向左的第一位1直接判断，遇到0直接略过，那效率是不是很快。
public class NumberOf1 {
    public int NumberOf1(int n) {
        int ans = 0;
        while (n != 0){
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }
}
