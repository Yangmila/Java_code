package practice;

public class Sort {
    public static void bubbleSort(int[] arr){
        for(int bound = 0;bound < arr.length;bound++){
            for(int cur = arr.length - 1;cur > bound;cur--){
                if(arr[cur] < arr[cur - 1]){
                    swap(arr,cur - 1,cur);
                }
            }
        }
    }

    public static void selectSort(int[] arr){
        int bound = 0;
        for(;bound < arr.length;bound++){
            for(int cur = bound + 1;cur < arr.length;cur++){
                if(arr[cur] < bound){
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        int bound = 1;
        for(;bound < arr.length;bound++){
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
    private static void swap(int[] arr, int x,int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
