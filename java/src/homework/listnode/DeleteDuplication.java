package homework.listnode;

public class DeleteDuplication {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode pHead = createList();
        for(ListNode cur = deleteDuplication(pHead);cur != null;cur = cur.next){
            System.out.print(cur.val+" ");
        }
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }

        ListNode newH = new ListNode(0);
        ListNode newT = newH;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur != null && cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                    }
                }else {
                    newT.next = new ListNode(cur.val);
                    newT = newT.next;
            }
            cur = cur.next;
        }
        return newH.next;
    }
}
