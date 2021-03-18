package homework;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> result = null;
    public List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        helper(root,0);
        return result;
    }

    public void helper(TreeNode root,int level){
        if (level == result.size()) {
            result.add(new ArrayList<Integer>());
        }

        result.get(level).add(root.val);
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }
}
