package practice.jianzhioffer;
//反转链表
//输入一个链表，反转链表后，输出新链表的表头。
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return newHead;
    }
}
