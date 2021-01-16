package homework;

import java.util.Arrays;

public class Transform {
    public static int[] transform(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            arr[i]=arr[i]*2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={32,54,5,35,86,13,97,45};
        int[] ret = transform(arr);
        System.out.println(Arrays.toString(ret));
    }
}
