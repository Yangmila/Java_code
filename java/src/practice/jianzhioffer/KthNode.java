package practice.jianzhioffer;

import java.util.ArrayList;

//二叉搜索树的第k个结点
//给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。
public class KthNode {
    //遇到二叉搜索树首先想到中序遍历
    ArrayList<TreeNode> ret = null;
    TreeNode KthNode(TreeNode pRoot, int k) {
        ret = new ArrayList<>();
        if(pRoot == null || k < 1){
            return null;
        }
        OrderTreeNode(pRoot,k);
        if(ret.size() < k){
            return null;
        }
        return ret.get(k - 1);
    }
    public void OrderTreeNode(TreeNode pRoot,int k){
        if(pRoot == null){
            return;
        }
        if(ret.size() >= k){
            return;
        }
        OrderTreeNode(pRoot.left,k);
        ret.add(pRoot);
        OrderTreeNode(pRoot.right,k);
    }
}
