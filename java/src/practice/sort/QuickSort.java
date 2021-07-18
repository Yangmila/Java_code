package practice.sort;

public class QuickSort {
    public static void quickSort(int[] arr) {
        // 创建一个辅助递归的方法.
        // 在这个方法的参数中, 明确指定针对哪个区间进行递归.
        // [0, length - 1]
        _quickSort(arr, 0, arr.length - 1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            // 如果当前的区间为空, 或者只有一个元素
            // 都不需要进行任何处理
            return;
        }
        // 现针对当前 [left, right] 区间进行 partition 操作
        // 方法的返回值, 表示整理完当前区间后, 基准值所在的位置.
        // 遍历过程中的 left 和 right 的重合位置
        int index = partition(arr, left, right);
        // 递归的对左侧区间进行快速排序
        _quickSort(arr, left, index - 1);
        // 递归的对右侧区间进行快速排序
        _quickSort(arr, index + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        // 选取最右侧元素作为基准值.
        int v = arr[right];
        int l = left;
        int r = right;
        // 如果 l 和 r 重合, 说明遍历完成
        while (l < r) {
            // 先从左往右, 找一个比基准值大的数字.
            while (l < r && arr[l] <= v) {
                l++;
            }
            // 当循环结束的时候, l 就指向了比基准值大的元素
            // 再从右往左, 找一个比基准值小的数字
            while (l < r && arr[r] >= v) {
                r--;
            }
            swap(arr, l, r);
        }
        // 当 l 和 r 重合的时候, 就把重合位置的元素和基准值位置进行交换
        swap(arr, l, right);
        // 最终方法返回基准值所在的位置(l 和 r 重合的位置)
        return l;
    }
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
