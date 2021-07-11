package practice.listnode;
//相交链表
//给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
//如果两个链表没有交点，返回 null 。
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 1. 先求两个链表的长度
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        // 2. 让长的链表先走
        if (len1 > len2) {
            int steps = len1 - len2;
            for (int i = 0; i < steps; i++) {
                headA = headA.next;
            }
        } else {
            int steps = len2 - len1;
            for (int i = 0; i < steps; i++) {
                headB = headB.next;
            }
        }
        // 3. 此时 headA 和 headB 已经在同一起跑线上了. 于是就同步往后走, 看能否相遇
        while (headA != null && headB != null) {
            // 此处比较的不是节点里的 val, 而是节点对象的身份.
            if (headA == headB) {
                // 相交了, 交点也找到了.
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public int getLength(ListNode head){
        int length = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            length++;
        }
        return length;
    }
}
