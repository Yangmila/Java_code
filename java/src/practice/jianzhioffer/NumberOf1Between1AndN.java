package practice.jianzhioffer;
//整数中1出现的次数
//输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数
//例如，1~13中包含1的数字有1、10、11、12、13因此共出现6次
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp > 0){
                if(tmp % 10 == 1){
                    count++;
                }
                tmp /= 10;
            }
        }
        return count;
    }
}
