package practice.jianzhioffer;
//二叉搜索树与双向链表
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree == null){
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null){
            return pRootOfTree;
        }
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while(leftTail != null && leftTail.right != null){
            leftTail = leftTail.right;
        }
        if(leftHead != null){
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        TreeNode rightHead = Convert(pRootOfTree.right);
        if (rightHead != null){
            rightHead.left = pRootOfTree;
            pRootOfTree.right = rightHead;
        }
        return (leftHead != null) ? leftHead : pRootOfTree;
    }
}
