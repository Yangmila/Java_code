package practice.treenode;

import java.util.ArrayList;
import java.util.List;
// 二叉树的层序遍历
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。
// （即逐层地，从左到右访问所有节点）。
public class LevelOrder {
    // result 就用于表示最终的结果
    // 为了能够在递归方法中方便的进行更新, 把这个结果
    // 做成了一个成员变量.
    public List<List<Integer>> result = null;
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 我们需要保证每次调用 levelOrder 都创建新的 result
        // 防止多个用例之间相互干扰.
        result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        // 我们的策略是采取递归的方式进行先序遍历, 把该节点的层数信息
        // 放到递归方法的参数中.
        helper(root, 0);
        return result;
    }

    public void helper(TreeNode root, int level) {
        if (level == result.size()) {
            // 如果满足这个条件, 意味着, 下面直接取下标就会出现
            // 越界的情况, 就需要给二维 List 中添加一个新行
            result.add(new ArrayList<Integer>());
        }
        // 就是一个简单的先序遍历.
        // 访问节点操作, 是把当前节点放到 result 的合适位置上.
        result.get(level).add(root.val);
        // 递归处理左右子树即可
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }
}
