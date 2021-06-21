package practice.treenode;
//二叉树的镜像
//操作给定的二叉树，将其变换为源二叉树的镜像。

//##采用递归思想##
//1.先处理根节点。若根节点为空，或为单个节点，则直接返回。否则交换左右节点
//2.处理根节点的左子树
//3.处理根节点的右子树
public class Mirror {
    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null){
            return pRoot;
        }
        if (pRoot.left == null && pRoot.right == null){
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
