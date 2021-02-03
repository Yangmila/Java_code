package homework.node;

public class TestWithNotDummy {
    public static Node createList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        return a;
    }

    // 按值删除节点
    public static void remove(Node head, int val){
        Node pre = head;
        while ((pre != null && pre.next != null && pre.next.val != val)){
            pre = pre.next;
        }
        if(pre == null && pre.next == null){
            return;
        }
        Node toDelete = pre.next;
        pre.next = toDelete.next;
    }

    // 按位置删除节点
    public static void remove(Node head, Node toDelete) {
        Node pre = head;
        while (pre != null && pre.next != toDelete) {
            pre = pre.next;
        }
        if (pre == null) {
            return;
        }
        pre.next = toDelete.next;
    }

    public static void main(String[] args) {
       Node head = createList();
       Node newNode = new Node(9);
       Node toDelet = head.next.next.next;

//       //把节点插入到1和2之间
//        Node pre = head;
//        newNode.next = pre.next;
//        pre.next = newNode;
//
//        //把节点插入到链表头部
//        newNode.next = head;
//        head = newNode;

        //尾插一个节点
        Node pre = head;
        while(pre.next != null){
            pre = pre.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;

    }
}
