package practice.jianzhioffer;
//合并两个排序的链表
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list2 == null && list1 == null){
            return null;
        }
        if(list1 != null && list2 == null){
            return list1;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return newHead.next;
    }
}
