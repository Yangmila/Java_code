package homework;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] arr = {1,21,32,3,53,65,75};
        int[]ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyOf(int[] arr) {
        int[] tmp = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            tmp[i] = arr[i];
        }
        return tmp;
    }
}
