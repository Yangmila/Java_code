package homework;

import java.util.ArrayList;
import java.util.List;

public class BuildTree {
    public int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        List<Integer> inorderList = new ArrayList<>();
        for(int i : inorder){
            inorderList.add(i);
        }
        return _buildTree(preorder,inorderList);
    }

    public TreeNode _buildTree(int[] preorder,List<Integer> inorder){
        if(inorder.isEmpty()){
            return null;
        }
        if (index >= preorder.length){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        int pos = inorder.indexOf(root.val);
        index++;

        root.left = _buildTree(preorder,inorder.subList(0,pos));
        root.right = _buildTree(preorder,inorder.subList(pos + 1,inorder.size()));
        return root;
    }
}
