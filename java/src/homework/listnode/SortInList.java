package homework.listnode;

import homework.listnode.ListNode;

import java.util.ArrayList;

public class SortInList {
    public ListNode sortInList (ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        list.sort((a,b)->{return a-b;});

        ListNode newCur = head;
        int i = 0;
        while(newCur != null){
            newCur.val = list.get(i++);
            newCur = newCur.next;
        }
        return head;
    }
}
