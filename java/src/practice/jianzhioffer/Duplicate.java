package practice.jianzhioffer;
//数组中重复的数字
//在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任一一个重复的数字。
//例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。存在不合法的输入的话输出-1
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public int duplicate1 (int[] numbers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < numbers.length;i++){
            Integer value = map.getOrDefault(numbers[i],0);
            map.put(numbers[i],value + 1);
        }
        for(int i = 0;i < numbers.length;i++){
            if(map.get(numbers[i]) > 1){
                return numbers[i];
            }
        }
        return -1;
    }
    public int duplicate (int[] numbers) {
        // write code here
        Set<Integer> set = new HashSet<>();
        for(int i : numbers){
            if(i < 0 || i >= numbers.length){
                return -1;
            }
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
}
