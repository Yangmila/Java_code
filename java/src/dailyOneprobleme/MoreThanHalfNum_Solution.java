package dailyOneprobleme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum_Solution {
    public int moreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : array){
            Integer value = map.getOrDefault(num,0);
            map.put(num,value + 1);
        }
        int mid = array.length / 2;
        for(int num : array){
            Integer value = map.get(num);
            if(value > mid){
                return array[num - 1];
            }
        }
        return 0;
    }
}
