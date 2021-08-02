package practice.jianzhioffer;
//二叉树的镜像
//操作给定的二叉树，将其变换为源二叉树的镜像。
public class Mirror {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return null;
        }
        if(pRoot.left == null && pRoot.right == null){
            return pRoot;
        }
        TreeNode tmp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = tmp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
