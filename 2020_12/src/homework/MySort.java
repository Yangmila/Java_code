package homework;

import java.util.Arrays;
import java.util.Stack;

public class MySort {
    //插入排序
    public static void insertSort(int[] arr){
        for(int bound = 1;bound < arr.length;bound++){
            int v = arr[bound];
            int cur = bound - 1;

            for(;cur >= 0;cur--){
                if(arr[cur] > v){
                    arr[cur + 1] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    //希尔排序
    public static void shellSort(int[] arr){
        int gap = arr.length / 2;
        while(gap >= 1){
            _shellSort(arr,gap);
            gap = gap / 2;
        }
    }

    public static void _shellSort(int[] arr,int gap){
        for(int bound = gap;bound < arr.length;bound++){
            int v = arr[bound];
            int cur = bound - gap;

            for(;cur >= 0;cur-=gap){
                if(arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else {
                    break;
                }
                arr[cur + gap] = v;
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr){
        int bound = 0;
        int cur = bound + 1;
        for(;bound < arr.length;bound++){
            for(;cur < arr.length;cur++){
                if(arr[cur] < arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void swap(int[] arr,int cur,int bound){
        int tmp = arr[cur];
        arr[cur] = arr[bound];
        arr[bound] = tmp;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length - i;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
    }

    //堆排序
    public static void heapSort(int[] arr){
        creatHeap(arr);
        int heapSize = arr.length;
        for(int i = 0;i < arr.length;i++){
            swap(arr,0,heapSize - 1);
        }
    }

    public static void creatHeap(int[] arr){
        for(int i = (arr.length - 1 - 1)/2;i >= 0;i--){
            shiftDown(arr,arr.length,i);
        }
    }

    public static void shiftDown(int[] arr,int size,int index){
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size){
            if(child + 1 < size && arr[child + 1] > arr[child]){
                child = child + 1;
            }
            if(arr[parent] < arr[child]){
                swap(arr,parent,child);
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    //快速排序
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length - 1);
    }

    public static void _quickSort(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int index = partition(arr,left,right);
        _quickSort(arr, left, index - 1);
        _quickSort(arr, index + 1, right);
    }

    public static int partition(int[] arr,int left,int right){
        int v = arr[right];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[i] <= v) {
                i++;
            }
            while (i < j && arr[j] >= v) {
                j--;
            }
            swap(arr, i, j);
        }
        swap(arr, i, right);
        return i;
    }

    public static void quickSortByLoop(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length - 1);
        while (!stack.isEmpty()) {
            int end = stack.pop();
            int beg = stack.pop();
            if (beg >= end) {
                continue;
            }
            int index = partition(arr, beg, end);
            stack.push(index + 1);
            stack.push(end);

            stack.push(beg);
            stack.push(index - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 6, 8};
//        insertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
        bubbleSort(arr);
//        heapSort(arr);
//        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
