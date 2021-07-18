package practice.sort;

public class InsertSort {
    public static void insertSort(int[] arr){
        int bound = 1;//分界线
        // [0, bound) 是已排序区间.
        // [bound, length) 待排序区间.
        for(;bound < arr.length;bound++){//插入过程
            //里面每次就要执行具体的比较插入过程
            //取出待排序区间的最开始元素
            int v = arr[bound];
            // 无序区间的第一个数
            int cur = bound - 1;
            for(;cur >= 0;cur--){
                //这个循环就是在执行比较插入的细节
                //拿着v这个值依次往前进行比较，找到合适的位置
                if(arr[cur] > v){
                    //说明v应该插入到arr[cur]之前
                    //于是就得把cur位置的元素往后进行搬运一个格子
                    arr[cur + 1] = arr[cur];
                }else {
                    //说明已将找到合适的位置了，就结束循环
                    //这个所谓的“合适”的位置，就是cur的后一个位置
                    //也就是cur+1这个下标
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }
}
