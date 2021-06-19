package practice.listnode;

public class ListNode {
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
