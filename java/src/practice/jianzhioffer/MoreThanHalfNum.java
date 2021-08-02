package practice.jianzhioffer;

import java.util.HashMap;

// 数组中出现
// 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。
// 1<=数组长度<=50000，0<=数组元素<=10000
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer value = map.getOrDefault(array[i],0);
            map.put(array[i],value + 1);
        }
        int num = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            Integer value = map.get(array[i]);
            if (value > num){
                return array[i];
            }
        }
        return 0;
    }
}
