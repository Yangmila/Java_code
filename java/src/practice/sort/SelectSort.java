package practice.sort;

public class SelectSort {
    public static void selectSort(int[] arr){
        //创建一个变量bound表示已排序区间和待排序区间的边界
        // [0, bound) 是已排序区间.
        // [bound, length) 待排序区间.
        int bound = 0;
        for(;bound < arr.length;bound++){
            //里层循环要进行打擂台的过程.
            //擂台的位置就是bound下标的位置
            for(int cur = bound + 1;cur < arr.length;cur++){
                if (arr[cur] < arr[bound]) {
                    // 如果发现挑战者比擂主小, 就交换两个元素
                    swap(arr, cur, bound);
                }
            }
        }
    }
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
