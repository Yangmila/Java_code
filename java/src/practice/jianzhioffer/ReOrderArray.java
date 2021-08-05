package practice.jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

//调整数组顺序使奇数位于偶数前面
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class ReOrderArray {
    public int[] reOrderArray (int[] array) {
        int len = array.length;
        if(len == 0){
            return array;
        }
        Queue<Integer> jiShu = new LinkedList<>();
        Queue<Integer> ouShu = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                ouShu.offer(array[i]);
            }else {
                jiShu.offer(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(!jiShu.isEmpty()){
                array[i] = jiShu.poll();
            }else {
                array[i] = ouShu.poll();
            }
        }
        return array;
    }
}
