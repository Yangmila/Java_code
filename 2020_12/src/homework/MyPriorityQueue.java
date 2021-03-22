package homework;

public class MyPriorityQueue {
    private  int[] data = new int[1000];
    private  int size = 0;

    public MyPriorityQueue(int[] data, int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            this.data[i] = data[i];
        }
    }

    public static void creatHeap(int[] arr){
        for(int i = (arr.length - 1 - 1)/2;i >= 0;i--){
            shiftDown(arr,arr.length,i);
        }
    }

    public static void shiftDown(int[] arr,int size,int index){
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size){
            if(child + 1 < size && arr[child + 1] > arr[child]){
                child = child + 1;
            }
            if(arr[parent] < arr[child]){
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void shiftUp(int[] arr,int size,int index){
        int child = index;
        int parent = (child - 1) / 2;
        while(child > 0){
            if(arr[parent] < arr[child]){
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            }else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    public void offer(int val){
        if(size >= data.length){
            return;
        }
        data[size] = val;
        size++;
        shiftUp(data,size,size - 1);
    }

    public Integer peek(){
        if(size == 0){
            return null;
        }
        return data[0];
    }

    public Integer poll(){
        if(size == 0){
            return null;
        }
        int result = data[0];
        data[0] = data[size - 1];
        size--;
        shiftDown(data,size,0);
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,7,5,8,9};
        creatHeap(arr);

        MyPriorityQueue myPriorityQueue = new MyPriorityQueue(arr,arr.length);
        myPriorityQueue.offer(11);
        System.out.println(myPriorityQueue);
        Integer result = myPriorityQueue.poll();
        System.out.println(myPriorityQueue);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
