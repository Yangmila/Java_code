package homework;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum= new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, sum, 0, nums1.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);

        Arrays.sort(sum);
        int l = nums1.length + nums2.length;
        int r = l / 2;
        double ret = 0;
        if(l % 2 == 0){
            ret = (sum[r] + sum[r-1])/2.0;
        }else{
            ret = sum[r];
        }
        return ret;
    }
}
