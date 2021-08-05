package practice.jianzhioffer;
//重建二叉树
//给定某二叉树的前序遍历和中序遍历，请重建出该二叉树并返回它的头结点。
//例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出如下图所示。
import java.util.ArrayList;
import java.util.List;

public class ReConstructBinaryTree {
    public int index = 0;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        index = 0;
        List<Integer> inorder = new ArrayList<>();
        for (int x: in) {
            inorder.add(x);
        }
        return build(pre,inorder);
    }

    private TreeNode build(int[] pre, List<Integer> inorder) {
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root = new TreeNode(pre[index]);
        index++;
        int pos = inorder.indexOf(root.val);
        root.left = build(pre,inorder.subList(0,pos));
        root.right = build(pre,inorder.subList(pos + 1,inorder.size()));
        return root;
    }
}
