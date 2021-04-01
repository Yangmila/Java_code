package homework.listnode;

import java.util.Scanner;

public class RemoveElements {
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
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        ListNode head = createList();
        ListNode result = removeElements(head,val);
        for (ListNode cur = result; cur != null; cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode prevNode = newNode;
        ListNode cur = head;

        while(cur != null){
            if(cur.val == val){
                prevNode.next = cur.next;
            }else {
                prevNode = cur;
                cur = cur.next;
            }
        }
        return newNode.next;
    }
}
