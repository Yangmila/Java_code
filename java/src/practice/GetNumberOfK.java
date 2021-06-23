package practice;
//数字在升序数组中出现的次数
//统计一个数字在升序数组中出现的次数。
public class GetNumberOfK {
    //方法一：暴力法
    public int GetNumberOfK1(int [] array , int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                count++;
            }
        }
        return count;
    }
    //方法二：二分查找,二分的前提：有序
    //这题分三步:
    //
    //二分法找出任何一个等于k的数组元素，记录下他的index
    //根据这个index向前查找所有等于k的元素数量
    //根据这个index向后查找所有等于k的元素数量
    private int upper_bound(int[] array, int val) {
        int l = 0, r = array.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            if (array[mid] <= val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private int lower_bound(int[] array, int val) {
        int l = 0, r = array.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            if (array[mid] < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int lowerIndex = lower_bound(array, k);
        int upperIndex = upper_bound(array, k);
        return upperIndex - lowerIndex;
    }
}
