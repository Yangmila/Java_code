package homework;

import java.util.Arrays;

public class Compress {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15} ;
        int ret = findUnsortedSubarray(nums);
        System.out.println(ret);
    }

    public static int findUnsortedSubarray(int[] nums) {
        int[] newnums = nums.clone();
        Arrays.sort(newnums);
        int start = newnums.length, end = 0;
        for (int i = 0; i < newnums.length; i++) {
            if (newnums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if(end - start >= 0){
            return end - start + 1;
        }
        return 0;
    }
}
