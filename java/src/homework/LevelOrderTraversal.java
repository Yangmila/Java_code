package homework;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return;
        }
        q.offer(root);
        while (true){
            TreeNode cur = q.poll();
            if (cur == null){
                break;
            }
            System.out.print(cur.val);
            if (cur.left != null){
                q.offer(cur.left);
            }
            if (cur.right != null){
                q.offer(cur.right);
            }
        }
    }
}
