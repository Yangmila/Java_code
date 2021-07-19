package practice;
//在排序数组中查找元素的第一个和最后一个位置
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
//如果数组中不存在目标值 target，返回 [-1, -1]。
public class SearchRange {
    public int[] searchRange(int[] nums, int target){
        int[] ret = new int[]{-1,-1};
        ret[0] = binarySearch(nums,target,true);
        ret[1] = binarySearch(nums,target,false);
        return ret;
    }

    public int binarySearch(int[] nums, int target, boolean leftOrRight) {
        int ret = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = left + ((right - left) / 2);
            if(nums[middle] < target){
                left = middle + 1;
            }else if ((nums[middle] > target)){
                right = middle - 1;
            }else {
                ret = middle;
                if (leftOrRight){
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }
        }
        return ret;
    }

}
