package practice.treenode;

import java.util.ArrayList;
import java.util.List;

//二叉树的中序遍历
//给定一个二叉树的根节点 root ，返回它的 中序 遍历。
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 递归处理左子树
        result.addAll(inorderTraversal(root.left));
        // 访问根节点
        result.add(root.val);
        // 递归处理右子树
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
