package homework;

public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree){
        if(pRootOfTree == null){
            return null;
        }
        if(pRootOfTree.left == null && pRootOfTree.right == null){
            return pRootOfTree;
        }
        TreeNode leafHead = Convert(pRootOfTree.left);
        TreeNode leafTail = leafHead;
        while(leafTail != null && leafTail.right != null){
            leafTail = leafTail.right;
        }
        if(leafHead != null){
            leafTail.right = pRootOfTree;
            pRootOfTree.left = leafTail;
        }
        TreeNode rightHead = Convert(pRootOfTree.right);
        if(rightHead != null){
            pRootOfTree.right = rightHead;
            rightHead.left = pRootOfTree;
        }
        return leafHead != null ? leafHead :pRootOfTree;
    }
}
