package practice.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

// 二叉树的下一个结点
//给定一个二叉树其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
//注意，树中的结点不仅包含左右子结点，同时包含指向父结点的next指针。
public class GetNext {
    public List<TreeLinkNode> list = null;
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        list = new ArrayList<>();
        if (pNode == null){
            return null;
        }
        TreeLinkNode cur = pNode;
        while (cur.next != null){
            cur = cur.next;
        }
        inOrder(cur);
        for (int i = 0; i < list.size(); i++) {
            if (pNode == list.get(i)){
                return (i == list.size() - 1) ? null : list.get(i + 1);
            }
        }
        return null;
    }

    private void inOrder(TreeLinkNode cur) {
        if (cur == null){
            return ;
        }
        inOrder(cur.left);
        list.add(cur);
        inOrder(cur.right);
    }
}
