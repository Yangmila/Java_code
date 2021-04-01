package homework;

import java.util.LinkedList;
import java.util.Queue;

public class IsCompleteTree {
    public boolean isCompleteTree(TreeNode root){
        if(root == null){
            return true;
        }
        boolean isLevel2 = false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (true){
            TreeNode cur = q.poll();
            if(cur == null){
                break;
            }
            if(!isLevel2){
                if(cur.left != null && cur.right != null){
                    q.offer(cur.left);
                    q.offer(cur.right);
                }else if(cur.left == null &&cur.right != null){
                    return false;
                }else if(cur.left != null && cur.right == null){
                    isLevel2 = true;
                    q.offer(cur.left);
                }else {
                    isLevel2 = true;
                }
            }else {
                if (cur.left != null || cur.right != null){
                    return false;
                }
            }
        }
        return true;
    }
}

