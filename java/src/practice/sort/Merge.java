package practice.sort;

public class Merge {
    public static void mergeSort(int[] arr) {
        _mergeSort(arr, 0, arr.length);
    }

    // 辅助递归的方法
    public static void _mergeSort(int[] arr, int left, int right) {
        if (right - left <= 1) {
            // 判定当前区间是不是只有一个元素或者没有元素
            // 此时不需要进行排序
            return;
        }
        int mid = (left + right) / 2;
        // 先让 [left, mid) 区间变成有序
        _mergeSort(arr, left, mid);
        // 再让 [mid, right) 区间变成有序
        _mergeSort(arr, mid, right);
        // 合并两个有序区间
        merge(arr, left, mid, right);
    }
    
    // 归并排序中的关键操作, 就是归并两个有序数组.
    // 使用该 merge 方法完成数组归并的过程
    // 此处两个数组就通过参数的 left, mid, right 描述
    // [left, mid) 左侧数组
    // [mid, right) 右侧数组
    public static void merge(int[] arr, int left, int mid, int right) {
        // 进行具体的归并操作
        // 需要创建一个临时的空间用来保存归并的结果
        // 临时空间得能保存下带归并的两个数组.
        // right - left 这么长
        if (left >= right) {
            // 空区间就直接忽略~~
            return;
        }
        int[] tmp = new int[right - left];
        int tmpIndex = 0; // 这个下标表示当前元素该放到临时空间的哪个位置上.
        int cur1 = left;
        int cur2 = mid;
        while (cur1 < mid && cur2 < right) {
            // 此处 最好写成 <= , 目的就是稳定性.
            // 由于 cur1 是在左侧区间, cur2 是在右侧区间.
            // 此时如果发现 cur1 和 cur2 的值相等,
            // 就希望左侧区间的 cur1 在最终结果中仍然是在左侧.
            // 于是就先把 cur1 对应的元素给先放到结果中.
            if (arr[cur1] <= arr[cur2]) {
                // 把 cur1 对应的元素插入到临时空间中
                tmp[tmpIndex] = arr[cur1];
                tmpIndex++;
                cur1++;
            } else {
                // 把 cur2 对应的元素插入到临时空间中
                tmp[tmpIndex] = arr[cur2];
                tmpIndex++;
                cur2++;
            }
        }
        // 循环结束之后, 需要把剩余的元素也都给拷贝到最终结果里.
        while (cur1 < mid) {
            tmp[tmpIndex] = arr[cur1];
            tmpIndex++;
            cur1++;
        }
        while (cur2 < right) {
            tmp[tmpIndex] = arr[cur2];
            tmpIndex++;
            cur2++;
        }
        // 还需要把 tmp 的结果再放回 arr 数组. (原地排序)
        // 把原始数组的 [left, right) 区间替换回排序后的结果
        for (int i = 0; i < tmp.length; i++) {
            arr[left + i] = tmp[i];
        }
    }

}
