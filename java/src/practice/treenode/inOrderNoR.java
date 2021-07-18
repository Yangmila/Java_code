package practice.treenode;

import java.util.Stack;

public class inOrderNoR {
    public static void inOrderNoR(TreeNode root) {
        // 1. 先搞一个栈
        Stack<TreeNode> stack = new Stack<>();
        // 2. 创建一个 cur 从 root 开始执行
        TreeNode cur = root;
        // 3. 第一层循环. 负责从栈里取元素
        while (true) {
            // 第二层循环. 负责往栈里插入元素
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                // 如果栈为空, 就直接结束循环
                break;
            }
            // 栈不为空, 就取出栈顶元素并访问
            TreeNode top = stack.pop();
            System.out.print(top.val);

            // 让 cur 指向 top 的右子树, 继续重复执行上述过程
            cur = top.right;
        }
    }
}
