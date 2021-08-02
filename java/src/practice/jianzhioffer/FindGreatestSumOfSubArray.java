package practice.jianzhioffer;
//连续子数组的最大和
//输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
//求所有子数组的和的最大值。要求时间复杂度为 O(n).
public class FindGreatestSumOfSubArray {
    //暴力解决
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for(int i = 0;i < array.length;i++){
            int sum = array[i];
            if(sum > max){
                max = sum;
            }
            for(int j = i + 1;j < array.length;j++){
                sum += array[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    //动态规划
    //dp[]数组：当前结尾序列子数组最大和
    public int FindGreatestSumOfSubArray1(int[] array) {
        int max = array[0];
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for(int i = 1;i < array.length;i++){
            if(dp[i - 1] > 0){
                dp[i] = dp[i - 1] + array[i];
            }else{
                dp[i] = array[i];
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
