package practice.listnode;
//反转链表 II
//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
//请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode pre = newHead;
        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        // 建议写在 for 循环里，语义清晰
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        // 第 3 步：切断出一个子链表（截取链表）
        ListNode leftNode = pre.next;
        ListNode cur = rightNode.next;

        // 注意：切断链接
        pre.next = null;
        rightNode.next = null;

        // 第 4 步：同第 206 题，反转链表的子区间
        reverse(leftNode);
        
        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        leftNode.next = cur;

        return newHead.next;
    }

    public ListNode reverse(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode next = cur.next;
            if (next == null){
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return newHead;
    }
}
