package homework;

public class LowestCommonAncestor {
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        find(root,p,q);
        return lca;
    }

    public boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return false;
        }
        int mid = (root == p || root ==q)? 1 : 0;
        int left = find(root.left, p, q) ? 1 : 0;
        int right = find(root.right, p, q) ? 1 : 0;
        if(mid + left + right == 2){
            lca = root;
        }
        return (left + right +mid) > 0 ;
    }
}
