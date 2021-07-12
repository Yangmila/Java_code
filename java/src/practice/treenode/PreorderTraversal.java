package practice.treenode;

import java.util.ArrayList;
import java.util.List;

// 二叉树的前序遍历
//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
            // 不要 return null;
        }
        // 先访问根节点. 此处的 "访问" 不是打印, 而是插入 result 末尾
        result.add(root.val);
        // 递归处理左子树, 此时会得到一个左子树的遍历结果的 List. 这个结果也要加入到 result 中
        result.addAll(preorderTraversal(root.left));
        // 递归处理右子树
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
