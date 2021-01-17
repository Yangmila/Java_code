package homework;

public class ArraySort {
    public static void sort(int[] arr) {
        int count = 1;
        for(int i = 1;i < arr.length;i++){
            if(arr[i-1] < arr[i])
                count++;
        }
        if(count==arr.length){
            System.out.println("该数组是递增序列！");
        }
        else
            System.out.println("该数组不是递增序列！");
    }
    public static void main(String[] args) {
        int[] arr = {12,76,32,34,56,87,98};
        sort(arr);
    }
}
