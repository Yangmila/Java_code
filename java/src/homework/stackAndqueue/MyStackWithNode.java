package homework.stackAndqueue;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

public class MyStackWithNode {
    private Node head = null;

    //入栈
    public void push(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //出栈
    public int pop(int val){
        int ret;

        if(head == null){
            return 0;
        }
        if(head.next == null){
            ret = head.val;
            head = null;
            return ret;
        }

        head = head.next;
        return head.val;
    }

    //取栈顶元素
    public Integer peek(){
        if(head == null){
            return  null;
        }
        return head.val;
    }
}
