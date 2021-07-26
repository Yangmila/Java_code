package practice.listnode;
//删除链表的倒数第 N 个结点
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode slow = newHead;
        ListNode fast = newHead;

        while (n-- > 0){
            fast = fast.next;
        }
        // 记住 待删除节点slow 的上一节点
        ListNode pre = null;
        while (fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        // 上一节点的next指针绕过 待删除节点slow 直接指向slow的下一节点
        pre.next = slow.next;
        return newHead.next;
    }
}
