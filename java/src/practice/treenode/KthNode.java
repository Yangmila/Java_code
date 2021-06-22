package practice.treenode;
//二叉搜索树的第k个结点
//给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。

import java.util.Stack;

//思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
//     所以，按照中序遍历顺序找到第k个结点就是结果。
public class KthNode {
    int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null || k == 0) return null;
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (pRoot != null || ! stack.isEmpty()) {
            while (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            pRoot = stack.pop();
            count ++;
            if(count == k) return pRoot;
            pRoot = pRoot.right;
        }
        return null;
    }
}
