package practice;
// 数组中重复的数字
//请找出数组中任一一个重复的数字。
//例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。
//存在不合法的输入的话输出-1
import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    //方法一：暴力法
    public int duplicate1 (int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        for (int i = 0; i < len; i++) {
            if (numbers[i] < 0 || numbers[i] >= len){
                return -1;
            }
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] == numbers[j]){
                    return numbers[i];
                }
            }
        }
        return -1;
    }
    //方法二：使用set
    //对于重复性问题可以想到set，遍历数组依次加入集合
    //若集合中存在该元素则直接返回该元素，否则将该元素加入集合：
    public int duplicate (int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: numbers) {
            if (i < 0 || i >= numbers.length){
                return -1;
            }
            if (set.contains(i)){
                return i;
            }else {
                set.add(i);
            }
        }
        return -1;
    }
}
