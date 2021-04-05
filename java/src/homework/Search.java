package homework;

public class Search {
    public int search (int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;

        if(nums == null){
            return -1;
        }
        while(low <= high){
            int mid = (high + low) / 2;
            if(target < nums[mid]){
                high = mid - 1;
            }else if(target >nums[mid]){
                low = mid + 1;
            }else{
                while(mid != 0 && nums[mid] == nums[mid - 1]){
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }
}
