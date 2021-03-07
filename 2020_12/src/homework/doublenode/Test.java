package homework.doublenode;

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
