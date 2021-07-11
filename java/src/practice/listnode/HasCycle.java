package practice.listnode;
//环形链表
//给定一个链表，判断链表中是否有环。
//如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
//如果链表中存在环，则返回 true 。 否则，返回 false 。
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        // 快慢指针
        // 快慢指针.创建两个引用. fast, slow.
        // fast每次走两步, slow每次走一步.
        // 如果链表不带环,此时fast就会率先到达终点null.
        // 如果链表带环, fast和slow进入环中之后, fast就会把 slow给套圈
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
