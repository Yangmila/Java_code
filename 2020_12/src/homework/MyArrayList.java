package homework;

public class MyArrayList {
    private String[] nummber = null;
    private int size = 0;
    private int capacity = 100;

    public MyArrayList(){
        nummber = new String[capacity];
    }

    private void realloc(){
        capacity = capacity + 100;
        String[] newNumber = new String[capacity];
        for(int i = 0;i < nummber.length; i++){
            newNumber[i] = nummber[i];
        }
        nummber = newNumber;
    }

    public void add(String elem){
        if(size >= capacity){
            realloc();
        }
        nummber[size] = elem;
        size++;
    }

    public void add(int index,String elem){
        if(size >= capacity){
            realloc();
        }
        if(index < 0 || index > size){
            return ;
        }
        for(int i = size - 1;i >= index; i--){
            nummber[i+1] = nummber[i];
        }
        nummber[index] = elem;
        size++;
    }

    public String remove(int index){
        if(index < 0||index > size){
            return null;
        }
        String ret = nummber[index];
        for(int i = size - 1;i <= index; i--){
            nummber[i] = nummber[i+1];
        }
        size--;
        return ret;
    }

    public boolean remove(String elem){
        int index;
        for(index = 0;index <size;index++){
            if(nummber[index].equals(elem)){
                break;
            }
        }
        if (index >= size){
            return false;
        }
        for(int i = size - 1;i < index; i--){
            nummber[i] = nummber[i+1];
        }
        size--;
        return true;
    }

    public String get(int index){
        if(index < 0||index >= size){
            return null;
        }
        return nummber[index];
    }

    public void set(int index,String elem){
        if(index < 0||index >= size){
            return ;
        }
        nummber[index] = elem;
    }

    public boolean contains(String elem){
        for(int i = 0;i < size; i++){
            if(nummber[i].equals(elem)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(String elem){
        for(int i = 0;i < size; i++){
            if(nummber[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(String elem){
        for(int i = size-1;i >= 0; i--){
            if(nummber[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        size = 0;
    }

    public  int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i = 0;i < size ;i++){
            stringBuilder.append(nummber[i]);
            if(i < size - 1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("不加糖");
        myArrayList.add("白敬亭");
        myArrayList.add("不举铁");
        System.out.println(myArrayList);
        myArrayList.add(2,"友利奈绪");
        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        myArrayList.remove("友利奈绪");
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(1));
        myArrayList.set(1,"杨慕涵");
        System.out.println(myArrayList);
        System.out.println(myArrayList.contains("不加糖"));
        System.out.println(myArrayList.indexOf("不加糖"));
        System.out.println(myArrayList.lastIndexOf("杨慕涵"));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
    }
}
