package practice.jianzhioffer;
//链表中倒数最后k个结点
//输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
//如果该链表长度小于k，请返回一个长度为 0 的链表。
public class FindKthToTail {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead == null || k < 0 ){
            return null;
        }
        int len = getLength(pHead);
        if(k > len){
            return null;
        }
        int step = len - k;
        for(int i = 0;i < step;i++){
            pHead = pHead.next;
        }
        return pHead;
    }
    public int getLength(ListNode head){
        int len = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }
}
