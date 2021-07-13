package practice.treenode;
//对称二叉树
//给定一个二叉树，检查它是否是镜像对称的。
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            // 一个为空, 一个不为空, 一定不是镜像关系
            return false;
        }
        // 先比较根节点的值是否相同
        if (p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right)
                && isMirror(p.right, q.left);
    }
}
