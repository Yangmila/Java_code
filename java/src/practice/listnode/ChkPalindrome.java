package practice.listnode;
//链表的回文结构
//对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
//给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
public class ChkPalindrome {
    public boolean chkPalindrome(ListNode A) {
        if (A == null) {
            // 空链表, 直接返回 true
            return true;
        }
        if (A.next == null) {
            return true;
        }
        // 1. 把原来的链表复制一份.
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        for (ListNode cur = A; cur != null; cur = cur.next) {
            newTail.next = new ListNode(cur.val);
            newTail = newTail.next;
        }
        ListNode B = newHead.next;
        // 2. 把新链表逆置
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                // cur 就指向最后一个节点了, 也就是逆置后的链表的头结点.
                B = cur;
            }
            // 逆置的核心操作: 掰道岔
            cur.next = prev;
            // 更新循环变量
            prev = cur;
            cur = next;
        }
        // 3. 对比两个链表是否一样
        ListNode cur1 = A;
        ListNode cur2 = B;
        while (cur1 != null && cur2 != null) {
            if (cur1.val != cur2.val) {
                // 找到了反例, 不是回文
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        // 找了一圈下来也没找到反例, 于是就判定这是回文
        return true;
    }
}
