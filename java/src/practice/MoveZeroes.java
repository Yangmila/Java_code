package practice;
//移动零
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        //第一次遍历的时候，j指针记录非o的个数，只要是非o的统统都赋给nums[j]
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        //非o元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        if (nums == null){
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
