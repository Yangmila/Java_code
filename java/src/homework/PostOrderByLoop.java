package homework;

import java.util.Stack;

public class PostOrderByLoop {
    public static void postOrderByLoop(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (true){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top = stack.peek();
            if(top.right == null || top.right == prev){
                System.out.print(top);
                stack.pop();
                prev = top;
            }else {
                cur = top.right;
            }
        }
    }
}
