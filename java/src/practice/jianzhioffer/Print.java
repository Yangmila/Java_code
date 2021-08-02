package practice.jianzhioffer;

import java.util.ArrayList;
//按之字形顺序打印
//描述
//给定一个二叉树，返回该二叉树的之字形层序遍历，
// （第一层从左向右，下一层从右向左，一直这样交替）
public class Print {
    public ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ret = new ArrayList<>();
        if(pRoot == null){
            return ret;
        }
        helper(pRoot,0);
        return ret;
    }
    public void helper(TreeNode pRoot,int level){
        if(ret.size() == level){
            ret.add(new ArrayList<>());
        }
        if(level % 2 == 0){
            ret.get(level).add(pRoot.val);
        }else{
            ret.get(level).add(0,pRoot.val);
        }
        if(pRoot.left != null){
            helper(pRoot.left,level + 1);
        }
        if(pRoot.right != null){
            helper(pRoot.right,level + 1);
        }
    }
}
