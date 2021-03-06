package homework.listnode;

public class MiddleNode {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode head = createList();

        ListNode cur = middleNode(head);
        System.out.print(cur.val+" ");
    }

    public static int getLength(ListNode head) {
        int len = 0;
        for(ListNode cur = head;cur != null;cur =cur.next){
            len++;
        }
        return len;
    }

    public static ListNode middleNode(ListNode head){
        if(head == null){
            return null;
        }

        int length = getLength(head);
        int step = length / 2;

        ListNode cur = head;
        for(int i = 0;i <step;i++){
            cur = cur.next;
        }
        return cur;
    }
}
