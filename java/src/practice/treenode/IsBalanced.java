package practice.treenode;
//平衡二叉树
//给定一个二叉树，判断它是否是高度平衡的二叉树。
//本题中，一棵高度平衡二叉树定义为：
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
public class IsBalanced {
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
//        return 1 + (getHeight(root.left) > getHeight(root.right)
//                ? getHeight(root.left) : getHeight(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        // 先进行遍历
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        // 访问当前节点.
        // 访问操作其实就是计算左右子树的高度, 并求差值
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if ((leftHeight - rightHeight) > 1
                || (leftHeight - rightHeight) < -1) {
            return false;
        }
        // 递归处理左右子树的情况.
        // 要求左子树 和 右子树 都是平衡的, 才能说明整个树是平衡的
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
