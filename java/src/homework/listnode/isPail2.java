package homework.listnode;

import java.util.Stack;

public class isPail2 {
    public boolean isPail (ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        ListNode newHead = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (newHead != null){
            if(newHead.val != stack.pop().val){
                return false;
            }
            newHead = newHead.next;
        }
        return true;
    }

}
