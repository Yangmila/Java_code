package practice.sort;

public class ShellSort {
    public static void shellSort(int[] arr){
        //指定gap序列，len/2,len/4....,1
        int gap = arr.length / 2;
        while (gap >= 1){
            _shellSort(arr,gap);
            gap = gap / 2;
        }
    }
    public static void _shellSort(int[] arr,int gap){
        //进行分组插排．分组依据就是 gap.
        // gap同时也表示分的组数.
        //同组的相邻元素,下标差值就是 gap
        //下面的代码其实和插入排序是一样的．尤其是把 gap设为1
        int bound = gap;
        for(;bound < arr.length;bound++){
            int v = arr[bound];
            int cur = bound - gap;
            for(;cur >= 0;cur-= gap){
                if(arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur + gap] = v;
        }

    }
}
