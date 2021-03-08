package homework.listnode;

public class ReverseList {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode head = createList();
        ListNode result = reverseList(head);
        for (ListNode cur = result; cur != null; cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode newHead = null;
        ListNode prevNode = null;
        ListNode curNode = head;

        while (curNode != null) {
            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                newHead = curNode;
            }
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return newHead;
    }
}
