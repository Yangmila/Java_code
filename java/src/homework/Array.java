package homework;

import java.util.Arrays;

public class Array {
    public static int[] setNumber(int[] arr){
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] ret = setNumber(arr);
        System.out.println(Arrays.toString(ret));
    }
}
