package practice.treenode;

import java.util.Stack;

public class PreOrderNoR {
    public static void preOrderNoR(TreeNode root){
        if (root == null) {
            return;
        }
        // 1. 先搞一个栈
        Stack<TreeNode> stack = new Stack<>();
        // 2. 把根节点入栈
        stack.push(root);
        // 3. 循环取栈顶元素并出栈
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            // 访问该元素
            System.out.print(cur.val);
            // 把右子树入栈
            if (cur.right != null) {
                stack.push(cur.right);
            }
            // 把左子树入栈
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }
}
