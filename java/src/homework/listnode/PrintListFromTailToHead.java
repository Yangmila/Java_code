package homework.listnode;

import homework.listnode.ListNode;

import java.util.ArrayList;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = listNode;
        while(cur != null){
            list.add(0,cur.val);
            cur = cur.next;
        }
        return list;
    }
}
