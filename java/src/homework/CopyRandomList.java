package homework;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        for(Node cur = head;cur != null;cur = cur.next){
            map.put(cur,new Node(cur.val));
        }
        for(Node oldNode = head;oldNode != null;oldNode = oldNode.next){
            Node newNode = map.get(oldNode);
            Node newNodeNext = map.get(oldNode.next);
            newNode.next = newNodeNext;
            Node newNodeRandom = map.get(oldNode.random);
            newNode.random = newNodeRandom;
        }
        return map.get(head);
    }
}
