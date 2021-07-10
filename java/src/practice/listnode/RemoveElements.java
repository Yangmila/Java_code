package practice.listnode;
//移除链表元素
//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 删除操作是需要找到当前节点的前一个节点的.
        ListNode prev = head; // 待删除的节点的前一个节点
        ListNode cur = head.next; // 待删除节点
        for (;cur != null;) {
            if (cur.val == val) {
                // 如果找到了值为 val 的节点
                // 就需要删除这个节点
                prev.next = cur.next;
                cur = prev.next;
            } else {
                // 如果没找到, 更新 prev 和 cur 的位置
                prev = prev.next;
                cur = cur.next;
            }
        }
        // 删除操作也需要单独考虑待删除元素是头结点的情况.
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
