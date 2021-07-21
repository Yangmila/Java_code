package practice;
//删除有序数组中的重复项
//给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
public class RemoveDuplicates {
    //双指针
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1;j <len;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //暴力法
    public int removeDuplicates1(int[] nums) {
        int len = nums.length;
        for(int i = 0;i < len - 1;i++){
            if(nums[i] == nums[i + 1]){
                for(int j = i + 1;j <len - 1;j++){
                    nums[j] = nums[j + 1];

                }
                len--;
                i--;
            }
        }
        return len;
    }
}
