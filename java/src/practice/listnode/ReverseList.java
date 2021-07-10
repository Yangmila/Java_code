package practice.listnode;
// 反转链表
//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        // 写任意代码的时候, 都要记得把特殊情况都得处理到位
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            // 链表里只有一个节点
            return head;
        }
        // 处理一般情况
        ListNode newHead = null;
        ListNode prevNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            // 进入循环的时候, 需要先设定好 nextNode 的位置
            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                // curNode 就指向了链表的最后一个节点.
                // 也就是反转后的新链表的头结点
                newHead = curNode;
            }
            // 掰道岔
            curNode.next = prevNode;
            // 更新引用的位置
            prevNode = curNode;
            curNode = nextNode;
        }
        return newHead;
    }
    //方法2：头插法
    //采用新建一个空next域的newHead头结点来指向新的反转过后的链表，另外利用了两个指针来保存当前节点和下一节点，
    // cur表示当前节点，next表示下一节点，每次开始时都需要让next称为cur的下一节点，
    // 然后开始断开cur和next之间的联系，并每次都让newHead的next域成为当前节点的next域，
    // 第一个节点的next域就被赋成了null，后面每次都是上一节点，
    // 然后再让当前节点成为newHead的下一节点，即newHead.next = cur，并且移动当前节点的位置到下一位置。
    public ListNode reverseList1(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = head;
        while(cur != null){
            ListNode nextNode = cur.next;
            /* 让现在的链表的第一个节点的下一指针域变成newHead的下一指针域 */
            /* 但是newHead的一开始的下一指针域是null，所以相当于是让head变成了新链表的头结点 */
            /* 但是后续的每一次就是让当前链表的头结点指向新链表的第一个节点(非newHead) */
            cur.next = dummy.next;
            /* 再让newHead指向当前链表的头节点 */
            dummy.next = cur;
            cur = nextNode;
        }
        return dummy.next;
    }
}
