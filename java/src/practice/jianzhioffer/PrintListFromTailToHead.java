package practice.jianzhioffer;

import java.util.ArrayList;
//从尾到头打印链表
//输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode cur = listNode;cur != null;cur = cur.next){
            list.add(0,cur.val);
        }
        return list;
    }
}
