package homework;

import homework.listnode.ListNode;

public class FindFirstCommonNode {
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;

        while(len1 < len2){
            cur2 = cur2.next;
            len2--;
        }
        while(len1 > len2){
            cur1 = cur1.next;
            len1--;
        }
        while(cur1 != null && cur2 != null){
            if(cur1 == cur2){
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }
    public int getLength(ListNode head){
        int len = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }
}
