package homework;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,5,4,3,2,1};
        System.out.println("交换前：");
        System.out.println("array1:"+ Arrays.toString(arr1));
        System.out.println("array2:"+Arrays.toString(arr2));
        changeArray(arr1,arr2);
        System.out.println("交换后：");
        System.out.println("array1:"+Arrays.toString(arr1));
        System.out.println("array2:"+Arrays.toString(arr2));
    }
    public static void changeArray(int[] arr1,int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
}
