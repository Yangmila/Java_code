package practice.listnode;
//链表的中间结点
//给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。
public class MiddleNode {
    public int getLength(ListNode head) {
        // 遍历链表即可
        int length = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            length++;
        }
        return length;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if(head.next == null){
            return head;
        }
        // 求链表的长度
        int length = getLength(head);
        // 针对长度 / 2, 得到的引用走的步数
        int steps = length / 2;
        // 控制引用往后走
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
