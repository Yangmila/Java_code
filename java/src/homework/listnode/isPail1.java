package homework.listnode;

public class isPail1 {
    public boolean isPail (ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        StringBuffer sb = new StringBuffer();
        for(ListNode cur = head;cur != null;cur = cur.next){
            sb.append(cur.val);
        }

        return isReverse(sb);
    }
    public boolean isReverse(StringBuffer sb){
        int len = sb.length();
        for(int i = 0;i < len;i++){
            if(sb.charAt(i) != sb.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
