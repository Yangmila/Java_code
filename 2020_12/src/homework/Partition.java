package homework;

import java.util.Scanner;

class ListNode{
    public ListNode next;
    int val;

    public ListNode(int v){
        val = v;
    }

    @Override
    public String toString() {
        return "{" + val +
                "}";
    }
}

public class Partition {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode pHead = createList();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(ListNode cur = partition(pHead,x);cur != null;cur = cur.next){
            System.out.print(cur.val+" ");
        }
    }

    public static ListNode partition(ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return null;
        }

        ListNode sHead = new ListNode(0);
        ListNode sTail = sHead;
        ListNode lHead = new ListNode(0);
        ListNode lTail = lHead;

        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            if (cur.val < x) {
                sTail.next = new ListNode(cur.val);
                sTail = sTail.next;
            } else {
                lTail.next = new ListNode(cur.val);
                lTail = lTail.next;
            }
            sTail.next = lHead.next;
        }
        return sHead.next;
    }
}



