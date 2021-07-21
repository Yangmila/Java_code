package practice;

import java.util.Arrays;

//有序数组的平方
//给你一个按 非递减顺序 排序的整数数组 nums，
// 返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
