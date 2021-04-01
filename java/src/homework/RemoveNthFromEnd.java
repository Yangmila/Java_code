package homework;

import homework.listnode.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        int length = getLength(head);

        for(int i = 1;i < length - n + 1;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return newHead.next;
    }

    public int getLength(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
