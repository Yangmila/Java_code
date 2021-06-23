package practice;

import java.util.HashMap;

// 数组中只出现一次的两个数字
//一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。
//请写程序找出这两个只出现一次的数字。
public class FindNumsAppearOnce {
    public int[] FindNumsAppearOnce (int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        /*
         * 1.调用map集合的方法keyset，所有的键存储到set集合中
         * 2.遍历set集合，获取出set集合中的所有元素（map中的键）
         * 3.调用map集合方法get，通过键获取到值
         */
        for (int i:map.keySet()) {
            if (map.get(i) == 1){
                ret[j] = i;
                j++;
            }
        }
        return ret;
    }
}
