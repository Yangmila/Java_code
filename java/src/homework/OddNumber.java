package homework;

import java.util.Arrays;

public class OddNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        sort(arr);
    }

    public static void sort(int[] arr) {
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] % 2 != 0){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
