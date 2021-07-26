package practice.listnode;
//两两交换链表中的节点
//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
//你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
public class SwapPairs {
    //递归
    //找终止条件。 什么情况下递归终止？没得交换的时候，递归就终止了呗。因此当链表只剩一个节点或者没有节点的时候，自然递归就终止了。
    //找返回值。 我们希望向上一级递归返回什么信息？由于我们的目的是两两交换链表中相邻的节点，因此自然希望交换给上一级递归的是已经完成交换处理，即已经处理好的链表。
    //本级递归应该做什么。 结合第二步，看下图！由于只考虑本级递归，所以这个链表在我们眼里其实也就三个节点：head、head.next、已处理完的链表部分。而本级递归的任务也就是交换这3个节点中的前两个节点，就很easy了。
    public ListNode swapPairs1(ListNode head) {
        //终止条件：链表只剩一个节点或者没节点了，没得交换了。返回的是已经处理好的链表
        if(head == null || head.next == null){
            return head;
        }
        //一共三个节点:head, next, swapPairs(next.next)
        //下面的任务便是交换这3个节点中的前两个节点
        ListNode next = head.next;
        head.next = swapPairs1(next.next);
        next.next = head;
        //根据第二步：返回给上一级的是当前已经完成交换后，即处理好了的链表部分
        return next;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode cur = head;
        ListNode pre = dump;
        while (cur != null && cur.next != null) {
            ListNode tmp = cur.next;
            cur.next = cur.next.next;
            tmp.next = cur;
            pre.next = tmp;
            pre = cur;
            cur = cur.next;
        }
        return dump.next;
    }
}
