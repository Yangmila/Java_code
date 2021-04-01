package homework.doublenode;

import java.util.Scanner;

public class Test {
    private Node head;
    private Node tail;
    private int length = 0;

    public Test(){
        head = null;
        tail = null;
    }

    public int length(){
        return this.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
    //头插
    public void addFirst(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }else{
            newNode.next = head;
            head.prev = newNode;
            length++;
            return;
        }
    }

    //尾插
    public void addLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            length++;
            return;
        }
    }

    //指定位置插入
    public  void add(int index,int val){
        if(index < 0 || index > length){
            return;
        }
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == length){
            addLast(val);
            return;
        }

        Node newNode = new Node(val);
        Node nextNode = getNode(index);
        Node prevNode = newNode.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = nextNode;
        nextNode.prev = newNode;
        length++;
    }

    //头删
    public void removeFifst(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }

        Node nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
        length--;
    }

    //尾删
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }

        Node prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;
        length--;
    }

    // 根据下标来删除
    public void removeByIndex(int index){
        if(index < 0||index >= length){
            return;
        }
        if(index == 0){
            removeFifst();
            return;
        }
        if(index == length - 1){
            removeLast();
            return;
        }

        Node toRemove = getNode(index);
        Node prevNode = toRemove.prev;
        Node nextNode = toRemove.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        length--;
    }

    // 根据值删除
    public void removeByValue(int val){
        int index = indexOf(val);
        if(index == -1){
            return;
        }
        removeByIndex(index);
    }

    // 根据值查找下标
    public int indexOf(int value){
        Node cur = head;
        for(int i = 0;i < length;i++){
            if(cur.val == value){
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }
    // 根据下标查找值
    public int get(int index){
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return  getNode(index).val;
    }

    // 修改
    public void set(int index,int value){
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node node = getNode(index);
        node.val = value;
    }
    // 根据下标找到节点
    public Node getNode(int index) {
        if(index < 0 || index >= length){
            return  null;
        }
        Node cur = head;
        for(int i = 0;i < index;i++){
            cur = cur.next;
        }
        return cur;
    }
}
