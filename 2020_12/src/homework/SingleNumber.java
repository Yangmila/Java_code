package homework;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for(int i = 1;i < nums.length;i++){
            ret ^= nums[i];
        }
        return ret;
    }
}
