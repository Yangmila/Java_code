package homework.node;

public class Test {
    public static Node createList(){
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        Node head = createList();
        //通过遍历，打印链表的每个元素。
//        for(Node cur = head;cur != null;cur = cur.next){
//            System.out.print(cur.val+" ");
//        }
//        System.out.println();
//        //通过遍历，找到链表的最后一个结点。
//        Node cur = head;
//        while(cur != null && cur.next != null){
//            cur = cur.next;
//        }
//        System.out.println(cur.val);
        //通过遍历，找到链表的倒数第二个结点。
//        Node cur = head;
//        while(cur != null && cur.next != null && cur.next.next != null){
//            cur = cur.next;
//        }
//        System.out.println(cur.val);
        //通过遍历，找到链表的第 n 个结点。（链表的长度 >= n)
//        int N = 2;
//        Node cur = head;
//        for(int i = 1;i < N; i++){
//            cur = cur.next;
//        }
//        System.out.println(cur.val);
        //通过遍历，计算链表中元素的个数。
//        Node cur = head;
//        int count = 0;
//        for(;cur != null;cur = cur.next){
//            count++;
//        }
//        System.out.println("链表中元素的个数为："+count);
        //通过遍历，找到链表中是否包含某个元素。
        int n = 3;
        Node cur = head;
        for(;cur != null;cur = cur.next){
            if(cur.val == n){
                break;
            }
        }
        if(cur != null){
            System.out.println("链表中包含"+n+"这个元素");
        }else {
            System.out.println("链表中不包含"+n+"这个元素");
        }
    }
}
