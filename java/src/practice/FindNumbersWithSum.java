package practice;
//和为S的两个数字
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
//如果有多对数字的和等于S，返回两个数的乘积最小的，如果无法找出这样的数字，返回一个空数组即可。
import java.util.ArrayList;
//因为数组是有序的，所以可以用双指针，指向数组的首尾，具体步骤如下：
//1.初始化：指针i指向数组首， 指针j指向数组尾部
//2. 如果arr[i] + arr[j] == sum , 说明是可能解
//3. 否则如果arr[i] + arr[j] > sum, 说明和太大，所以--j
//4. 否则如果arr[i] + arr[j] < sum, 说明和太小，所以++i
//因为要返回乘积最小的，最外层的乘积就是最小的
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (array.length <= 0 || array == null){
            return ret;
        }
        int right = 0;
        int left = array.length - 1;
        while (right < left){
            if (array[right] + array[left] == sum){
                ret.add(array[right]);
                ret.add(array[left]);
                break;
            }else if (array[right] + array[left] < sum){
                right++;
            }else {
                left--;
            }
        }
        return ret;
    }
}
