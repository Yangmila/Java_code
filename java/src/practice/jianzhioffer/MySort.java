package practice.jianzhioffer;

public class MySort {
    public int[] MySort (int[] arr) {
        quickSort(arr);
        return arr;
    }
    public void quickSort(int[] arr){
        if(arr == null){
            return;
        }
        _quickSort(arr,0,arr.length - 1);
    }
    public void _quickSort(int[] arr,int left,int right){
        if(left > right){
            return;
        }
        int index = partition(arr,left,right);
        _quickSort(arr,left,index - 1);
        _quickSort(arr,index + 1,right);
    }
    public int partition(int[] arr,int left,int right){
        int v = arr[right];
        int l = left;
        int r = right;
        while(l < r){
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
    public void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
