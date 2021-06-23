package practice.treenode;
//平衡二叉树
//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
//在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
//平衡二叉树（Balanced Binary Tree），
// 具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
public class IsBalanced_Solution {
    //递归方法
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if (Math.abs(left - right) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right)){
            return true;
        }
        return false;
    }

    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.right == null && root.left == null){
            return 1;
        }

        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right) + 1;
    }
}
