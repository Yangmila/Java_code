package homework;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int anSum = nums[0] + nums[1] + nums[2];
        for(int i = 0;i < nums.length;i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - anSum) > Math.abs(target - sum)){
                    anSum = sum;
                }
                if(sum > target){
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    return anSum;
                }
            }
        }
        return anSum;
    }
}
