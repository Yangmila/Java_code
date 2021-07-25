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

    //双指针法
//数组其实是有序的， 只不过负数平方之后可能成为最大数了。
//
//那么数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间。
//
//此时可以考虑双指针法了，i指向起始位置，j指向终止位置。
//
//定义一个新数组result，和A数组一样的大小，让k指向result数组终止位置。
//
//如果A[i] * A[i] < A[j] * A[j] 那么result[k--] = A[j] * A[j]; 。
//
//如果A[i] * A[i] >= A[j] * A[j] 那么result[k--] = A[i] * A[i]; 。
    public int[] sortedSquares1(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] ret = new int[nums.length];
        int k = ret.length - 1;
        while (i <= j){
            if (nums[i] * nums[i] < nums[j] * nums[j]){
                ret[k--] = nums[j] * nums[j];
                j--;
            }else {
                ret[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return ret;
    }
}
