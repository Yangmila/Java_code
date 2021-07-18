package practice.sort;

public class Sort {
    public static void insertSort(int[] a){
        int bound = 1;
        for(;bound < a.length;bound++){
            int v = a[bound];
            int cur = bound - 1;
            for(;cur >= 0;cur--){
                if(a[cur] > v){
                    a[cur + 1] = a[cur];
                }else {
                    break;
                }
            }
            a[cur + 1] = v;
        }
    }

    public static void shellSort(int[] a){
        int gap = a.length / 2;
        while (gap >= 1){
            _shellSort(a,gap);
            gap /= 2;
        }
    }
    public static void _shellSort(int[] a,int gap){
        int bound = gap;
        for(;bound < a.length;bound++){
            int v = a[bound];
            int cur = bound - gap;
            for (;cur >= 0;cur -= gap){
                if (a[cur] > v){
                    a[cur + gap] = a[cur];
                }else {
                    break;
                }
            }
            a[cur + gap] = v;
        }
    }

    public static void selectSort(int[] a){
        int bound = 0;
        for(;bound < a.length;bound++){
            for(int cur = bound + 1;cur < a.length;cur++){
                if(a[cur] < a[bound]){
                    swap(a,cur,bound);
                }
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void heapSort(int[] a){
        creatHeap(a);
        int heapSize = a.length;
        for(int i = 0;i < a.length;i++){
            swap(a,0,heapSize - 1);
            heapSize--;
            shiftDown(a,heapSize,0);
        }
    }
    public static void creatHeap(int[] a){
        for (int i = (a.length - 1 - 1) / 2; i >= 0 ; i--) {
            shiftDown(a,a.length,i);
        }
    }
    public static void shiftDown(int[] a,int size,int index){
        int parent = index;
        int child = parent * 2 + 1;
        while (child < size){
            if (child + 1 < size && a[child + 1] > a[child]){
                child = child + 1;
            }
            if (a[parent] < a[child]){
                swap(a,parent,child);
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void bubbleSort(int[] a){
        int bound = 0;
        for(;bound < a.length;bound++){
            for (int cur = a.length - 1;cur > bound;cur--){
                if (a[cur] < a[cur - 1]){
                    swap(a,cur,cur - 1);
                }
            }
        }
    }

    public static void quickSort(int[] a){
        _quickSort(a,0,a.length - 1);
    }
    public static void _quickSort(int[] a,int left,int right){
        if(left > right){
            return;
        }
        int index = partition(a,left,right);
        _quickSort(a,left,index - 1);
        _quickSort(a,index + 1,right);
    }
    public static int partition(int[] a,int left,int right){
        int v = a[right];
        int l = left;
        int r = right;
        while (l < r){
            while (l < r && a[l] <= v){
                l++;
            }
            while (l < r && a[r] >= v){
                r--;
            }
            swap(a,l,r);
        }
        swap(a,l,right);
        return l;
    }
}
