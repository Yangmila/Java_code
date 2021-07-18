package practice.sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // bound 用来区分两个区间
        // [0, bound) 是已排序区间.
        // [bound, length) 待排序区间.
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    swap(arr, cur - 1, cur);
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
