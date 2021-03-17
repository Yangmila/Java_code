package homework;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(q.right,p.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        boolean ret = isSameTree(s,t);
        if(ret){
            return ret;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}