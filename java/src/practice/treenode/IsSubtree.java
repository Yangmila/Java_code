package practice.treenode;
// 另一个树的子树
//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
// s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
public class IsSubtree {
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

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        boolean ret = isSameTree(s, t);
        if (ret) {
            return ret;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
}
