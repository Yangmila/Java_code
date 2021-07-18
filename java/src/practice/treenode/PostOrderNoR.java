package practice.treenode;

import java.util.Stack;

public class PostOrderNoR {
    public static void postOrderNoR(TreeNode root) {
        if (root == null) {
            return;
        }
        // 先创建一个栈
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;  // 记录后序遍历中的前一个节点
        while (true) {
            // 让 cur 出发一路往左走, 遇到非空节点都入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // cur 为空的时候, 取栈顶元素看看能不能访问
            if (stack.isEmpty()) {
                break;
            }
            // 栈顶元素不一定能访问. 真正访问的时候再出栈
            // 此时只是通过 peek 来取到这个元素即可
            TreeNode top = stack.peek();
            if (top.right == null || prev == top.right) {
                // 此时这个 top 是可以访问的
                System.out.print(top.val);
                stack.pop();
                prev = top;

                // 如果要是该节点能被访问, 此时 cur 没有变化(仍然是 null)
                // 下一轮循环就仍然是从栈顶这里取一个元素, 判定能不能访问
            } else {
                // 如果访问不了~, 就继续从 top 的右子树出发
                // 重复刚才的过程
                cur = top.right;
            }
        }
    }
}
