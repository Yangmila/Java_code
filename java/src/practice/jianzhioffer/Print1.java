package practice.jianzhioffer;

import java.util.ArrayList;
//把二叉树打印成多行
//从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
public class Print1 {
    ArrayList<ArrayList<Integer>> ret = null;
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ret = new ArrayList<>();
        if (pRoot == null){
            return ret;
        }
        helper(pRoot,0);
        return ret;
    }

    void helper(TreeNode pRoot, int level) {
        if(ret.size() == level){
            ret.add(new ArrayList<>());
        }
        ret.get(level).add(pRoot.val);
        if(pRoot.left != null){
            helper(pRoot.left,level + 1);
        }
        if (pRoot.right != null){
            helper(pRoot.right,level + 1);
        }
    }
}
