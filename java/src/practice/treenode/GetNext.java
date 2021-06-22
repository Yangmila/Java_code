package practice.treenode;

import java.util.ArrayList;

//二叉树的下一个结点
//示例:
//输入:{8,6,10,5,7,9,11},8
//返回:9
//解析:这个组装传入的子树根节点，其实就是整颗树，中序遍历{5,6,7,8,9,10,11}，
// 根节点8的下一个节点就是9，应该返回{9,10,11}，后台只打印子树的下一个节点，
// 所以只会打印9
public class GetNext {
    //方法一：暴力求解，直接模拟
    //既然给了二叉树的某个结点，且二叉树存储着指向父结点的指针（next），那
    //我们可以先找到根节点，再对树进行中序遍历，最后根据中序遍历结果找到给定结点的下一结点
    static ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext1(TreeLinkNode pNode) {
        TreeLinkNode cur = pNode;
        while (cur.next != null){
            cur = cur.next;
        }
        InOrder(cur);
        for (int i = 0; i < list.size(); i++) {
            if (pNode == list.get(i)){
                return i == list.size() - 1 ? null : list.get(i + 1);
            }
        }
        return null;
    }

    public void InOrder(TreeLinkNode pNode) {
        if (pNode != null){
            InOrder(pNode.left);
            list.add(pNode);
            InOrder(pNode.right);
        }
    }

    //方法二：直接找下一节点
    //1有右子树，下一结点是右子树中的最左结点，例如 B，下一结点是 H
    //2无右子树，且结点是该结点父结点的左子树，则下一结点是该结点的父结点，例如 H，下一结点是 E
    //3无右子树，且结点是该结点父结点的右子树，则我们一直沿着父结点追朔，直到找到某个结点是其父结点的左子树，如果存在这样的结点，那么这个结点的父结点就是我们要找的下一结点。例如 I，下一结点是 A；例如 G，并没有符合情况的结点，所以 G 没有下一结点
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //1
        if (pNode.right != null){
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null){
                pRight = pRight.left;
            }
            return pRight;
        }
        //2
        if (pNode.next != null && pNode.next.left == pNode){
            return pNode.next;
        }
        //3
        if (pNode.next != null){
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext){
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }
}

