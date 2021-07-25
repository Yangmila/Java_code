package practice;
//长度最小的子数组
//给定一个含有 n 个正整数的数组和一个正整数 target 。
//找出该数组中满足其和 ≥ target 的长度最小的连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
//如果不存在符合条件的子数组，返回 0 。
public class MinSubArrayLen {
    //暴力法
    public int minSubArrayLen1(int target, int[] nums) {
        int ret = nums.length + 1;// 最终的结果
        int sum = 0; // 子序列的数值之和
        int subArrayLen = 0; // 子序列的长度
        for (int i = 0; i < nums.length; i++) {
            // 设置子序列起点为i
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                // 设置子序列终止位置为j
                sum += nums[j];
                if (sum >= target){
                    subArrayLen = j - i + 1;
                    ret = ret < subArrayLen ? ret : subArrayLen;
                    // 因为我们是找符合条件最短的子序列，所以一旦符合条件就break
                    break;
                }
            }
        }
        // 如果result没有被赋值的话，就返回0，说明没有符合条件的子序列
        return ret == nums.length + 1 ? 0 : ret;
    }

    //滑动窗口
    public int minSubArrayLen(int target, int[] nums) {
        int ret = nums.length + 1;
        int sum = 0;// 滑动窗口数值之和
        int subArrayLen = 0;// 滑动窗口的长度
        int i = 0;// 滑动窗口起始位置
        int j = i;
        for (; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target){
                // 注意这里使用while，每次更新 i（起始位置），并不断比较子序列是否符合条件
                subArrayLen = j - i + 1;// 取子序列的长度
                ret = ret < subArrayLen ? ret : subArrayLen;
                sum -= nums[i++];// 这里体现出滑动窗口的精髓之处，不断变更i（子序列的起始位置）
            }
        }
        // 如果result没有被赋值的话，就返回0，说明没有符合条件的子序列
        return ret == nums.length + 1 ? 0 : ret;
    }
}
