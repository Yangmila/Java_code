package practice.jianzhioffer;

public class QuickSort {
    public void quickSort(int[] array){
        _quickSort(array,0,array.length - 1);
    }

    private void _quickSort(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int index = patition(array,left,right);
        _quickSort(array,left,index - 1);
        _quickSort(array,index + 1,right);
    }

    private int patition(int[] array, int left, int right) {
        int v = array[right];
        int l = left;
        int r = right;
        while (l < r){
            while (l < r && array[l] <= v){
                l++;
            }
            while (l < r && array[r] >= v){
                r--;
            }
            swap(array,l,r);
        }
        swap(array,l,right);
        return l;
    }

    private void swap(int[] array, int l, int r) {
        int tmp = array[l];
        array[l] = array[r];
        array[r] = tmp;
    }

}
