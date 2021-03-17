package homework;

public class IsBalanced {
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return  1 + (leftHeight > rightHeight ? leftHeight :rightHeight);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if((leftHeight - rightHeight > 1) || (leftHeight - rightHeight < -1)){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
