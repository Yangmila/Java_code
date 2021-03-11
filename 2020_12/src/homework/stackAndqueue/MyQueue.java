package homework.stackAndqueue;

public class MyQueue {
    private int[] data;
    private int capacity = 100;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public MyQueue(){
        data = new int[capacity];
    }

    //入队列
    private void realloc(){
        capacity = capacity + 100;
        int[] newData = new int[capacity];
        int[] data = new int[0];
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
    }
    public boolean offer(int val) {
        if (size == data.length) {
            realloc();
            return false;
        }
        data[tail] = val;
        tail++;
        if (tail == data.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    // 出队列
    public Integer poll() {
        if (size == 0) {
            return null;
        }
        int ret = data[head];
        head++;
        if (head == data.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    // 取队首元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return data[head];
    }
}
