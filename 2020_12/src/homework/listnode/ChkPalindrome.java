package homework.listnode;

public class ChkPalindrome {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode pHead = createList();
        System.out.print(chkPalindrome(pHead));

    }

    public static boolean chkPalindrome(ListNode pHead) {
        if(pHead == null){
            return true;
        }
        if (pHead.next == null){
            return true;
        }

        ListNode newH = new ListNode(0);
        ListNode newT = newH;
        for(ListNode cur = pHead;cur != null;cur = cur.next){
            newT.next = new ListNode(cur.val);
            newT = newT.next;
        }
        ListNode newpHead = newH.next;

        ListNode pre = null;
        ListNode cur = newpHead;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                newpHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode cur1 = pHead;
        ListNode cur2 = newpHead;
        while(cur1 == null && cur2 == null){
            if(cur1.val != cur2.val){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }
}
