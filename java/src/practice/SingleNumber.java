package practice;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if(value == null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],value + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }

    public int singleNum(int[] nums){
        int ret = 0;
        for (int x:nums) {
            ret ^= x;
        }
        return ret;
    }
}
