package practice.listnode;
//链表中倒数第k个结点
//输入一个链表，输出该链表中倒数第k个结点。
public class findKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            return null;
        }
        int length = getLength(head);
        if (k > length) {
            // k 允许等于 length
            return null;
        }
        // 得到倒数第 k 个节点, 就让引用从头开始, 走 length - k 步即可
        int steps = length - k;
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        // 此时, cur 就指向了倒数第 k 个节点
        return cur;
    }
    public int getLength(ListNode head){
        int length = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            length++;
        }
        return length;
    }
}
