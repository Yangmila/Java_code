package homework.listnode;

public class DetectCycle {
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && slow != null){
            fast = head.next.next;
            slow = head.next;

            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return  null;
        }

        ListNode cur1 = head;
        ListNode cur2 = fast;

        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
