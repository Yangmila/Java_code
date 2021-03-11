package homework.stackAndqueue;

public class MyStack {
    private int[] data;
    private int size = 0;
    private int capacity = 100;

    public MyStack(){
        data = new int[capacity];
    }

    //入栈
    private void realloc(){
        capacity = capacity + 100;
        int[] newData = new int[capacity];
        int[] data = new int[0];
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
    }

    public void push(int val){
        if(size >= capacity){
            realloc();
            return;
        }
        data[size] = val;
        size++;
    }

    //出栈
    public Integer pop(){
        if(size == 0){
            return null;
        }
        int ret = data[size - 1];
        size--;
        return ret;
    }

    //取栈顶元素
    public Integer peek(){
        if (size == 0) {
            return null;
        }
        return data[size - 1];
    }
}
