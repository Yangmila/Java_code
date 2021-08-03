package practice.jianzhioffer;
//二维数组中的查找
//在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
//[
//[1,2,8,9],
//[2,4,9,12],
//[4,7,10,13],
//[6,8,11,15]
//]
//给定 target = 7，返回 true。
//
//给定 target = 3，返回 false。
public class Find {
    //方法一：二分查找
    //有序数组考虑二分查找
    //数组值arr[x][y]表示指定的是第x行第y列的值。
    //在使用二维数组对象时，注意length所代表的长度，
    //数组名后直接加上length(如arr.length)，所指的是有几行(Row)；
    //指定索引后加上length(如arr[0].length)，指的是该行所拥有的元素，也就是列(Column)数目
    public boolean Find1(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            int low = 0;
            int high = array[i].length - 1;
            while (low <= high){
                int mid = (low + (high - low)) / 2;
                if (target < array[i][mid]){
                    high = mid - 1;
                }else if (target > array[i][mid]){
                    low = mid + 1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    //方法二：利用二维数组由上到下，由左到右递增的规律，
    //那么选取右上角或者左下角的元素a[row][col]与target进行比较，
    //当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,
    //即col--；
    //当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
    //即row++；
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0){
            if (target == array[row][col]){
                return true;
            }else if (target > array[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}
