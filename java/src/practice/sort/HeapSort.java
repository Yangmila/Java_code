package practice.sort;

public class HeapSort {
    public static void heapSort(int[] arr) {
        // 1. 先建立堆!!
        createHeap(arr);
        // 2. 需要循环的取出堆顶元素, 和最后一个元素交换并删除之
        //    再从 0 位置进行调整
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // 交换 0 号元素和堆的最后一个元素
            swap(arr, 0, heapSize - 1);
            // 把最后一个元素从堆上删除
            heapSize--;
            // 从 0 号位置开始往下进行调整
            shiftDown(arr, heapSize, 0);
        }
    }

    public static void createHeap(int[] arr) {
        //从最后一个非叶子结点开始
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, arr.length, i);
        }
    }

    public static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            // 先找出左右子树比较大的~
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            // 再去比较 child 和 parent
            if (arr[parent] < arr[child]) {
                swap(arr, parent, child);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
