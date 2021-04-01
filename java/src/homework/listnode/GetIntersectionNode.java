package homework.listnode;

public class GetIntersectionNode {
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

    public static ListNode createList1(){
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }

    public static void main(String[] args) {
        ListNode headA = createList();
        ListNode headB = createList1();

        for(ListNode cur = getIntersectionNode(headA,headB);cur != null;cur = cur.next){
            System.out.print(cur.val+" ");
        }
    }

    public static int getLength(ListNode head){
        int len = 0;

        for(ListNode cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int len1 = getLength(headA);
        int len2 = getLength(headB);

        if(len1 < len2){
            int step = len2 - len1;
            for(int i = 0;i < step; i++){
                headB = headB.next;
            }
        }else {
            int step = len1 - len2;
            for(int i = 0;i < step; i++){
                headA = headA.next;
            }
        }

        while (headA != null && headB !=null){
            if(headA == headB){
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
