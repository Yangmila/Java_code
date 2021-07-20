package practice;
//移除元素
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
class RemoveElement {
    //暴力算法
    //这个题目暴力的解法就是两层for循环，一个for循环遍历数组元素 ，第二个for循环更新数组。
    public int removeElement(int[] nums,int val){
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) { // 发现需要移除的元素，就将数组集体向前移动一位
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--; // 因为下表i以后的数值都向前移动了一位，所以i也向前移动一位
                length--; // 此时数组的大小-1
            }
        }
        return length;

    }

    //双指针法（快慢指针法）： 通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。
    public int removeElement1(int[] nums,int val){
        int smallIndex = 0;
        for(int fastIndex = 0;fastIndex < nums.length;fastIndex++){
            if (nums[fastIndex] != val){
                nums[smallIndex++] = nums[fastIndex];
            }
        }
        return smallIndex;
    }
}
