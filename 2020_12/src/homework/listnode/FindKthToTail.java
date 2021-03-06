package homework.listnode;

import java.util.Scanner;

public class FindKthToTail {
    public static ListNode createList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static void main(String[] args) {
        ListNode head = createList();

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        ListNode cur = findKthToTail(head,k);
        System.out.print(cur.val+" ");
    }

    public static ListNode findKthToTail(ListNode head, int k){
        if(head == null){
            return null;
        }
        if(k < 0) {
            return null;
        }

        int length = getLength(head);
        if(k > length){
            return null;
        }

        int step = length - k;
        ListNode cur = head;
        for(int i = 0;i < step; i++){
            cur = cur.next;
        }
        return cur;
    }

    public static int getLength(ListNode head) {
        int len = 0;
        for(ListNode cur = head;cur != null;cur =cur.next){
            len++;
        }
        return len;
    }
}
