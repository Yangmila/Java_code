package practice;

public class Sort {
    public static void bubbleSort(int[] arr){
        for(int bound = 0;bound < arr.length;bound++){
            for(int cur = arr.length - 1;cur > bound ;cur--){
                if (arr[cur] < arr[cur - 1]){
                    swap(arr,cur,cur-1);
                }
            }
        }
    }

    public static void selectSort(int[] arr){
        int bound = 0;
        for(;bound < arr.length;bound++){
            for(int cur = bound + 1;cur < arr.length;cur++){
                if(arr[cur] < arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        int bound  = 1;
        for (;bound < arr.length;bound++){
            int v = arr[bound];
            int cur = bound - 1;
            for(;cur >= 0;cur--){
                if (arr[cur] > v){
                    arr[cur + 1] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length - 1);
    }
    public static void _quickSort(int[] arr, int left, int right) {
        if (left >= right){
            return;
        }
        int index = partition(arr,left,right);
        _quickSort(arr,left,index - 1);
        _quickSort(arr,index + 1,right);

    }
    public static int partition(int[] arr, int left, int right) {
        int v = arr[right];
        int l = left;
        int r = right;
        while (l < r){
            while (l < r && arr[l] <= v){
                l++;
            }
            while (l < r && arr[r] >= v){
                r--;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }


    private static void swap(int[] arr, int x,int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
