package homework;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] arr) {
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {21,23,43,64,26,16,49};
        bubble(arr);
    }
}

