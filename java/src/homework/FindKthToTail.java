package homework;

import homework.listnode.ListNode;

public class FindKthToTail {
    public ListNode findKthToTail (ListNode pHead, int k) {
        if(pHead == null){
            return null;
        }
        if(k < 0){
            return null;
        }

        int length = getLength(pHead);
        if(k > length){
            return null;
        }

        int step = length - k;
        ListNode cur = pHead;
        for(int i = 0;i < step;i++){
            cur = cur.next;
        }
        return cur;
    }

    public int getLength(ListNode pHead){
        int length = 0;
        for(ListNode cur = pHead;cur != null;cur = cur.next){
            length++;
        }
        return length;
    }
}
