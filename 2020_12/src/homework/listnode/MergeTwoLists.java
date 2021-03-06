package homework.listnode;

public class MergeTwoLists {
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

    public static ListNode createList2(){
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(7);
        ListNode e = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode l1 = createList();
        ListNode l2 = createList2();
        for(ListNode cur = mergeTwoLists(l1,l2);cur != null;cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode nHead = new ListNode(0);
        ListNode nTail = nHead;

        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                nTail.next = cur1;
                cur1 = cur1.next;
            }else{
                nTail.next = cur2;
                cur2 = cur2.next;
            }
            nTail = nTail.next;
        }
        if(cur1 == null){
            nTail.next = cur2;
        }
        if(cur2 == null){
            nTail.next = cur1;
        }
        return nHead.next;
    }
}
