package practice.jianzhioffer;
//链表中环的入口结点
//输入分为2段，第一段是入环前的链表部分，第二段是链表环的部分，后台将这2个会组装成一个有环或者无环单链表
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        ListNode cur = pHead;
        ListNode cur1 = fast;
        while (cur != cur1){
            cur = cur.next;
            cur1 = cur1.next;
        }
        return cur;
    }
}
