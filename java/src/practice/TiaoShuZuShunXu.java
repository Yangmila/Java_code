package practice;
//调整数组顺序使奇数位于偶数前面
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
import java.util.LinkedList;
import java.util.Queue;
//思路：开辟两组新的空间，我这里用的是LinkedList，因为想要用到队列的先进先出方法
//
//1、先找出奇数利用2余某个数不为零就是奇数（这里不考虑0的情况），那么余2是0那就是偶数啦
//2、然后奇数放在一个链表里面，偶数放在一个链表里面。链表不需要事先知道长度大小，所以用链表方便，数组是没法确定大小的。
//3、就先将放了奇数的链表一个一个出栈（poll函数）放在题目给的array中，然后就是偶数，思路中的很简单
public class TiaoShuZuShunXu {
    public int[] reOrderArray (int[] array) {
        int len = array.length;
        if(len == 0){
            return array;
        }
        Queue<Integer> jiShu = new LinkedList<>();
        Queue<Integer> ouShu = new LinkedList<>();
        for(int i = 0;i < len;i++){
            if(array[i] % 2 != 0){
                jiShu.add(array[i]);
            }else{
                ouShu.add(array[i]);
            }
        }
        for(int i = 0;i < len;i++){
            if(!jiShu.isEmpty()){
                array[i] = jiShu.poll();
            }else{
                array[i] = ouShu.poll();
            }
        }
        return array;
    }
}
