package homework;

import java.util.Stack;

public class InOrderByLoop {
    public static void inOrderByLoop(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(true){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top = stack.pop();
            System.out.print(top.val);
            cur = top.right;
        }
    }
}
