package practice.treenode;
//相同的树
//给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            // 进入这个条件意味着, 一定是 p 和 q 其中一个为空, 一个不为空
            return false;
        }
        // 都不为空树, 先判定根节点是不是值相同
        if (p.val != q.val) {
            return false;
        }
        // 根节点相同, 再分别比较左右子树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
