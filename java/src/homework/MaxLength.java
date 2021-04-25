package homework;

import java.util.HashMap;

public class MaxLength {
    public int maxLength (int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
            int max = 1;
            int start = 0;
            int end = 0;

            for(;end < arr.length;end++){
                if(map.containsKey(arr[end])){
                    start = Math.max(start,map.get(arr[end]) + 1);
                }
                max = Math.max(max,end - start + 1);
                map.put(arr[end],end);
            }
            return max;
    }
}
