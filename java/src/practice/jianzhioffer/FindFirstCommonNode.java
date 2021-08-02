package practice.jianzhioffer;
//两个链表的第一个公共结点
//输入两个无环的单链表，找出它们的第一个公共结点。
//（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        if(len1 > len2){
            for(int i = 0;i < (len1 - len2);i++){
                cur1 = cur1.next;
            }
        }else{
            for(int i = 0;i < (len2 - len1);i++){
                cur2 = cur2.next;
            }
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
    public int getLength(ListNode Head){
        int len = 0;
        for(ListNode cur = Head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }
}
